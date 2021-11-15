package service;

import model.Product;

import java.util.List;

public interface ProductService {

    public List<Product> showAllProduct();

    public Product findById(int id);

    public void deleteProduct(int id);

    public void createProduct(Product product);

    public void edit(Product product);
}
