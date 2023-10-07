/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.Product;
import java.sql.Connection;
import java.sql.ResultSet;
import context.SQLDatabase;

/**
 *
 * @author admin
 */
public class ProductDAO extends SQLDatabase {

    public ProductDAO(Connection connection) {
        super(connection);
    }

    public void add(Product product) {
        executeUpdatePreparedStatement(
            "INSERT INTO Product( name, image, price, title, description, cateID,sell_ID image1, image2, image3, image4, image5,user)"
            + " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)",
            product.getName(),
            product.getImage(),
            product.getPrice(),
            product.getTitle(),
            product.getDescription(),
            product.getCateID(),
            product.getSell_ID(),
            product.getImage1(),
            product.getImage2(),
            product.getImage3(),
            product.getImage4(),
            product.getImage5(),
            product.getUser()
        );
    }

}
