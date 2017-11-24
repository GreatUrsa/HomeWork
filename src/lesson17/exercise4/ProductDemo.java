package lesson17.exercise4;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Создать несколько объектов класса Категория.
 * Создать метод, распечатывающий товары каталога, отсортированные по имени, цене или рейтингу.
 * Используем классы компараторы для каждого вида сортировки.
 */
public class ProductDemo {
    public static void main(String[] args) {
        ProductComparatorName productComparatorName = new ProductComparatorName();
        SortedSet<Product> productsName = new TreeSet<>(productComparatorName);
        ProductComparatorPrice productComparatorPrice = new ProductComparatorPrice();
        SortedSet<Product> productsPrice = new TreeSet<>(productComparatorPrice);
        ProductComparatorRating productComparatorRating = new ProductComparatorRating();
        SortedSet<Product> productsRating = new TreeSet<>(productComparatorRating);

        productsName.add(new Product("Peony", 30, 2));
        productsName.add(new Product("Tulip", 25, 4));
        productsName.add(new Product("Lotus", 40, 3));
        productsName.add(new Product("Carnation", 15, 5));
        productsName.add(new Product("Rose", 35, 1));

        Category flowers = new Category("Flowers", productsName);
    }
}
