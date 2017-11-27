package lesson17.exercise4;

import java.util.*;

/**
 * Создать несколько объектов класса Категория.
 * Создать метод, распечатывающий товары каталога, отсортированные по имени, цене или рейтингу.
 * Используем классы компараторы для каждого вида сортировки.
 */
public class ProductDemo {
    public static void main(String[] args) {
        Category flowers = new Category("Flowers", new HashSet<>(Arrays.asList(
                new Product("Peony", 30, 2),
                new Product("Tulip", 25, 4),
                new Product("Lotus", 40, 3),
                new Product("Carnation", 15, 5),
                new Product("Rose", 35, 1)
        )));
        Category clothes = new Category("Clothes", new HashSet<>(Arrays.asList(
                new Product("Tie", 270, 2),
                new Product("TShirt", 450, 5),
                new Product("Skirt", 875, 1),
                new Product("Trousers", 690, 3),
                new Product("Dress", 950, 4)
        )));
        Category drinks = new Category("Drinks", new HashSet<>(Arrays.asList(
                new Product("soda water", 10, 4),
                new Product("still water", 8, 3),
                new Product("coffee", 10, 5),
                new Product("lemonade", 10, 2),
                new Product("tea", 10, 1)
        )));

        printByName(flowers, clothes, drinks);
        printByPrice(flowers, clothes, drinks);
        printByRating(flowers, clothes, drinks);
    }

    public static void printProducts(Set<Product> sorted, Category... categories) {
        for (Category c : categories) {
            sorted.addAll(c.getProducts());
        }
        for (Product product : sorted) {
            System.out.println(product);
        }
    }

    public static void printByName(Category... categories) {
        SortedSet<Product> byName = new TreeSet<>(new ProductComparatorName());
        System.out.println("==========sorted by name==========");
        printProducts(byName, categories);
    }

    public static void printByPrice(Category... categories) {
        SortedSet<Product> byPrice = new TreeSet<>(new ProductComparatorPrice());
        System.out.println("==========sorted by price==========");
        printProducts(byPrice, categories);
    }

    public static void printByRating(Category... categories) {
        SortedSet<Product> byRating = new TreeSet<>(new ProductComparatorRating());
        System.out.println("==========sorted by rating==========");
        printProducts(byRating, categories);
    }
}
