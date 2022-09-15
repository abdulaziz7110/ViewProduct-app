package uz.pdp.viewproductapp.dao;

import org.springframework.stereotype.Component;
import uz.pdp.viewproductapp.connection.DBConnetion;
import uz.pdp.viewproductapp.dto.ProductDto;
import uz.pdp.viewproductapp.model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class ProductDao {

    public List<ProductDto> getAllProduct(){

        List<ProductDto> list = new ArrayList<>();


        try {
            Connection connection = DBConnetion.getConnection();
            Statement statement = connection.createStatement();
            String sql = "select * from product";


            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
            int anInt = resultSet.getInt(1);
            String name = resultSet.getString(2);
            Double price = resultSet.getDouble(3);
            String description = resultSet.getString(4);
            int categoryId = resultSet.getInt(5);

            ProductDto product = ProductDto.builder()
                    .id(anInt)
                    .name(name)
                    .price(price)
                    .description(description)
                    .categoryId(categoryId)
                    .build();
            list.add(product);
            }

            return list;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }




    }
}
