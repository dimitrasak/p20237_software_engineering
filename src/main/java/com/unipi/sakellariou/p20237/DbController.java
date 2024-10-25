package com.unipi.sakellariou.p20237;

import org.springframework.web.bind.annotation.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@RestController
public class DbController {
    private static String url = "jdbc:sqlite:src/main/resources/DB/mydb.db";
    @RequestMapping("/allusers")
    public String selectAllEvents(){
        String selectSQL = "Select * from User";
        StringBuilder builder = new StringBuilder();
        try {
            Connection connection = DriverManager.getConnection(url);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(selectSQL);
            while (resultSet.next()){
                builder.append(resultSet.getString("UserName"));
            }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return builder.toString();
    }
}
