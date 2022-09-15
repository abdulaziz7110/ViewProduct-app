package uz.pdp.viewproductapp.connection;

import org.postgresql.Driver;
import org.postgresql.util.DriverInfo;
import org.springframework.aop.scope.ScopedObject;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Component
public class DBConnetion {

    public static Connection getConnection(){


        try {
            Connection connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/product_db",
                       "postgres",
                    "12iPhone"
            );
            return connection;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
