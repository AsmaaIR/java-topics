package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OrderRepository {
    private List<Order> orders;

    public OrderRepository() {
        Item item1 = new Item(1, "Item1", 100);
        Item item2 = new Item(2, "Item2", 150);
        Item item3 = new Item(3, "Item3", 200);
        Item item4 = new Item(4, "Item4", 220);
        Item item5 = new Item(5, "Item5", 250);
        Item item6 = new Item(6, "Item6", 300);

        Order order1 = new Order(1, Arrays.asList(item1, item2), "Ahmed");
        Order order2 = new Order(2, Arrays.asList(item2,item4), "Mohamed");
        Order order3 = new Order(3, Arrays.asList(item6), "Khaled");
        Order order4 = new Order(4, Arrays.asList(item5, item3, item1), "Ahmed");
        Order order5 = new Order(5, Arrays.asList(item3, item1), "Amr");
        Order order6 = new Order(6, Arrays.asList(item4, item2), "Omar");
        Order order7 = new Order(7, Arrays.asList(item6), "Khaled");

        orders = Arrays.asList(order1, order2, order3, order4, order5, order6, order7);

    }

    public List<Order> findAll() {
        return orders;
    }

    public Order findOrderById(int targetId) {
        for (Order order : orders) {
            if (order.getId() == targetId) {
                return order;
            }
        }
        return null; // Item not found
    }

    public Optional<Order> findOrderByIdWithOptional(int targetId) {
        for (Order order : orders) {
            if (order.getId() == targetId) {
                return Optional.of(order);
            }
        }
        return Optional.empty(); // Item not found
    }

}
