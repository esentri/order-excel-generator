package com.esentri.order.excel.generator;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

class RandomDataGenerator {

    private RandomDataGenerator() {
        // Shall not be instantiated
    }
    static List<Order> createRandomOrders(int numberOfEntries) {
        final List<Order> orders = new ArrayList<>();
        for(int i = 0; i < numberOfEntries; i++) {
            final Article article = randomEnum(Article.class);
            Order order = new Order(
                randomEnum(Company.class),
                randomEnum(Department.class),
                article,
                randomPositiveIntInRange(article.getMin(), article.getMax()));
            orders.add(order);
        }
        return orders;
    }

    static int randomPositiveIntInRange(int min, int max) {
        return ThreadLocalRandom
            .current()
            .ints(min, max+1)
            .limit(1)
            .findFirst()
            .orElse(1);
    }


    private static <T extends Enum<?>> T randomEnum(Class<T> clazz){
        int x = ThreadLocalRandom.current().nextInt(clazz.getEnumConstants().length);
        return clazz.getEnumConstants()[x];
    }

}
