package behavioralpatterns.iterator;

public class Test {
    public static void main(String[] args) {
        ProductCollection products = new ProductCollection();
        products.addProduct(new Product("mac"));
        products.addProduct(new Product("Iphone"));
        products.addProduct(new Product("earpods"));

        Iterator iterator = products.createIterator();
        while(iterator.hasNext()) {
            System.out.println(((Product) iterator.next()).getName());
        }



    }
}
