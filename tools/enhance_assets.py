from __future__ import annotations

from pathlib import Path

from PIL import Image, ImageChops, ImageEnhance, ImageOps


ROOT = Path(__file__).resolve().parents[1]
ASSETS_DIR = ROOT / "assets"
OUT_DIR = ASSETS_DIR / "enhanced"


def trim_whitespace(img: Image.Image, bg_color: tuple[int, int, int] = (255, 255, 255)) -> Image.Image:
    """Trim uniform white borders around diagrams."""
    img = ImageOps.exif_transpose(img)
    rgb = img.convert("RGB")
    bg = Image.new("RGB", rgb.size, bg_color)
    diff = ImageChops.difference(rgb, bg)
    bbox = diff.getbbox()
    if not bbox:
        return img
    return img.crop(bbox)


def enhance_image(img: Image.Image) -> Image.Image:
    img = trim_whitespace(img).convert("RGB")
    img = ImageEnhance.Contrast(img).enhance(1.08)
    img = ImageEnhance.Sharpness(img).enhance(1.15)
    return img


def main() -> None:
    OUT_DIR.mkdir(parents=True, exist_ok=True)

    pngs = sorted(p for p in ASSETS_DIR.glob("*.png") if p.is_file())
    if not pngs:
        raise SystemExit(f"No PNG files found in {ASSETS_DIR}")

    written = 0
    for in_path in pngs:
        out_path = OUT_DIR / in_path.name
        img = Image.open(in_path)
        img.load()
        enhanced = enhance_image(img)
        enhanced.save(out_path, format="PNG", optimize=True)
        written += 1

    print(f"Enhanced {written} PNG(s) into: {OUT_DIR}")


if __name__ == "__main__":
    main()

