package behavioralpatterns.iterator;

public class ProductCollection implements Collection{
    int numberofProducts = 0;
    Product[] products;

    public ProductCollection() {
        products = new Product[10];
    }


    public void addProduct(Product product) {
        products[numberofProducts] = product;
        numberofProducts = numberofProducts + 1;
    }

    @Override
    public Iterator createIterator() {
        return new ProductIterator(products);
    }
}
