package pl.com.bottega.photostock.sales.infrastructure.repositories;

import pl.com.bottega.photostock.sales.model.Product;
import pl.com.bottega.photostock.sales.model.ProductRepository;
import pl.com.bottega.photostock.sales.model.products.Picture;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by bernard.boguszewski on 17.04.2016.
 */
public class FakeProductRepository implements ProductRepository {

    private static Map<String, Product> fakeDatabase = new HashMap<>();

    static {
        Picture p1 = new Picture("f", 2, "jpg", new String[]{}, "as", true, "nr1");
        Picture p2 = new Picture("f", 2, "jpg", new String[]{}, "as", true, "nr2");

        fakeDatabase.put(p1.getNumber(), p1);
        fakeDatabase.put(p2.getNumber(), p2);
    }

    @Override
    public Product load(String nr) {
        Product product = fakeDatabase.get(nr);
        if (product == null)
            throw new RuntimeException("product " + nr + " does not exist");// TODO: 17.04.2016 wprowadzic wyjatek DataDoesNotExistException;
        return product;
    }

    @Override
    public void save(Product product) {
        fakeDatabase.put(product.getNumber(), product);
    }
}
