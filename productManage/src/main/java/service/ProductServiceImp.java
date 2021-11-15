package service;

import model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductServiceImp implements ProductService {

    private String jdbcURL = "jdbc:mysql://localhost:3306/productManagement?allowPublicKeyRetrieval=true&useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "123456";

    public ProductServiceImp() {
    }

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

    String SHOW_ALL_PRODUCT = "SELECT id, productName, price, quantity, color, category, des FROM products";

    @Override
    public List<Product> showAllProduct() {
        List<Product> listProduct = new ArrayList<>();

        try {
            Connection connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(SHOW_ALL_PRODUCT);
            System.out.println(statement);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("productName");
                int price = rs.getInt("price");
                int quantity = rs.getInt("quantity");
                String color = rs.getString("color");
                String category = rs.getString("category");
                String description = rs.getString("des");
                listProduct.add(new Product(id, name, price, quantity, color, category, description));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listProduct;
    }

    String SHOW_PRODUCT_BY_ID = "SELECT id, productName, price, quantity, color, category FROM products WHERE id = ?";

    @Override
    public Product findById(int id) {
        Product product = null;
        try {
            Connection connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(SHOW_PRODUCT_BY_ID);
            statement.setInt(1, id);
            System.out.println(statement);
            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                int idProduct = rs.getInt("id");
                String name = rs.getString("productName");
                int price = rs.getInt("price");
                int quantity = rs.getInt("quantity");
                String color = rs.getString("color");
                String category = rs.getString("category");
                String description = rs.getString("des");
                product = new Product(name, price, quantity,color,category,description);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return product;
    }

    String DELETE_PRODUCT_BY_ID = "DELETE FROM products WHERE id = ?";

    @Override
    public void deleteProduct(int id) {
        try {
            Connection connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(DELETE_PRODUCT_BY_ID);
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    String INSERT_PRODUCT_SQL = "INSERT INTO products(productName, price, quantity, color, category, des) VALUES (?, ?, ?, ?, ?, ?)";

    @Override
    public void createProduct(Product product) {
        System.out.println(INSERT_PRODUCT_SQL);
        try {
            Connection connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(INSERT_PRODUCT_SQL);
            statement.setString(1, product.getProductName());
            statement.setInt(2, product.getPrice() );
            statement.setInt(3, product.getQuantity());
            statement.setString(4, product.getColor());
            statement.setString(5, product.getCategory());
            statement.setString(6, product.getDescription());
            System.out.println(statement);
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    String EDIT_PRODUCT_BY_ID = "UPDATE products SET productName = ?, price = ?, quantity = ?, color = ?, category = ?, des = ? WHERE id = ?";

    @Override
    public void edit(Product product) {
        System.out.println(EDIT_PRODUCT_BY_ID);
        try {
            Connection connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(EDIT_PRODUCT_BY_ID);
            statement.setString(1, product.getProductName());
            statement.setInt(2, product.getPrice());
            statement.setInt(3, product.getQuantity());
            statement.setString(4, product.getColor());
            statement.setString(5, product.getCategory());
            statement.setString(6, product.getDescription());
            statement.setInt(7, product.getId());
            System.out.println(statement);
            statement.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
