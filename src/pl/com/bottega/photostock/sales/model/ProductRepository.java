package pl.com.bottega.photostock.sales.model;

/**
 * Created by bernard.boguszewski on 17.04.2016.
 */
public interface ProductRepository {
    Product load(String nr);
    void save(Product product);
}
