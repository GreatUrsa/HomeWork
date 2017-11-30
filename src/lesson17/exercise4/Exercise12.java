package lesson17.exercise4;

import java.util.*;

/**
 * Переделать задание 4 (класс Товар),  используя Collections.sort() для сортировки.
 * Добавить возможность сортировать в обратном порядке (Collections.reverse()).
 */
public class Exercise12 {
    public static void main(String[] args) {
        List<Product> flowers = new ArrayList<>();
        flowers.add(new Product("Peony", 30, 2));
        flowers.add(new Product("Tulip", 25, 4));
        flowers.add(new Product("Lotus", 40, 3));
        flowers.add(new Product("Carnation", 15, 5));
        flowers.add(new Product("Rose", 35, 1));

        List<Product> clothes = new ArrayList<>();
        clothes.add(new Product("Tie", 270, 2));
        clothes.add(new Product("TShirt", 450, 5));
        clothes.add(new Product("Skirt", 875, 1));
        clothes.add(new Product("Trousers", 690, 3));
        clothes.add(new Product("Dress", 950, 4));

        List<Product> drinks = new ArrayList<>();
        drinks.add(new Product("soda water", 10, 4));
        drinks.add(new Product("still water", 8, 3));
        drinks.add(new Product("coffee", 10, 5));
        drinks.add(new Product("lemonade", 10, 2));
        drinks.add(new Product("tea", 10, 1));

        printByName(flowers);
        printByPrice(drinks);
        printByRating(clothes);
        printReverse(flowers);
        printReverse(drinks);
        printReverse(clothes);
    }

    public static void printProducts(List<Product> sorted) {
        for (Product product : sorted) {
            System.out.println(product);
        }
    }

    public static void printByName(List<Product> sorted) {
        Comparator<Product> byName = new ProductComparatorName();
        System.out.println("============sorted by name============");
        Collections.sort(sorted, byName);
        printProducts(sorted);
    }

    public static void printByPrice(List<Product> sorted) {
        Comparator<Product> byPrice = new ProductComparatorPrice();
        System.out.println("============sorted by price===========");
        Collections.sort(sorted, byPrice);
        printProducts(sorted);
    }

    public static void printByRating(List<Product> sorted) {
        Comparator<Product> byRating = new ProductComparatorRating();
        System.out.println("===========sorted by rating===========");
        Collections.sort(sorted, byRating);
        printProducts(sorted);
    }

    public static void printReverse(List<Product> sorted) {
        System.out.println("=============reverse sort=============");
        Collections.reverse(sorted);
        printProducts(sorted);
    }
}
