package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductDB {

    private static Connection getConnection() throws SQLException {
        String dbUrl = "jdbc:sqlite:C:/Users/savag/OneDrive/Desktop/Java SE Programming/guitar_shop.sqlite";
        Connection connection = DriverManager.getConnection(dbUrl);
        return connection;
    }

    public static ArrayList<Product> getAll() {
        String sql = "SELECT ProductCode, ProductName, ListPrice "
                + "FROM Product ORDER BY ProductCode ASC";
        var products = new ArrayList<Product>();
        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                String code = rs.getString("ProductCode");
                String name = rs.getString("ProductName");
                double price = rs.getDouble("ListPrice");

                Product p = new Product(code, name, price);
                products.add(p);
            }
            return products;
        } catch (SQLException e) {
            System.err.println(e);
            return null;
        }
    }

    public static Product get(String code) {
        String sql = "SELECT ProductCode, ProductName, ListPrice "
                + "FROM Product "
                + "WHERE ProductCode = ?";
        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, code);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String name = rs.getString("ProductName");
                double price = rs.getDouble("ListPrice");
                Product p = new Product(code, name, price);
                rs.close();
                return p;
            } else {
                rs.close();
                return null;
            }
        } catch (SQLException e) {
            System.err.println(e);
            return null;
        }
    }

    public static boolean add(Product p) {
        String sql = "INSERT INTO Product (ProductCode, ProductName, ListPrice) "
                + "VALUES (?, ?, ?)";
        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, p.getCode());
            ps.setString(2, p.getName());
            ps.setDouble(3, p.getListPrice());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }
    }

    public static boolean delete(Product p) {
        String sql = "DELETE FROM Product "
                + "WHERE ProductCode = ?";
        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, p.getCode());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }
    }

    public static boolean update(Product p) {
        String sql = "UPDATE Product SET "
                + "  ProductName = ?, "
                + "  ListPrice = ? "
                + "WHERE ProductCode = ?";
        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, p.getName());
            ps.setDouble(2, p.getListPrice());
            ps.setString(3, p.getCode());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }
    }

    public static ArrayList<Product> getProductsByCategory(int categoryId) {
        String sql = "SELECT ProductCode, ProductName, ListPrice "
                + "FROM Product "
                + "WHERE CategoryID = ?";
        ArrayList<Product> products = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, categoryId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String code = rs.getString("ProductCode");
                String name = rs.getString("ProductName");
                double price = rs.getDouble("ListPrice");
                Product p = new Product(code, name, price);
                products.add(p);
            }
        } catch (SQLException e) {
            System.err.println(e);
        }
        return products;
    }
}
