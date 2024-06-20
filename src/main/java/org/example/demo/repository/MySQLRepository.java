package org.example.demo.repository;

import org.example.demo.entity.Articles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySQLRepository {
    private final String MYSQL_CONNECTION= "jdbc:mysql://localhost:3306/article";
    private final String MYSQL_USERNAME= "root";
    private final String MYSQL_PASSWORD= "";

    public Articles saveArticles(Articles obj) {
        try(Connection conn = DriverManager.getConnection(MYSQL_CONNECTION,MYSQL_USERNAME,MYSQL_PASSWORD)){
            String sql = "Insert into articles1(Title,describe1,Content) values(?,?,?)";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, obj.getTitle());
            preparedStatement.setString(2, obj.getDescription());
            preparedStatement.setString(3, obj.getContent());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return obj;
    }
}
