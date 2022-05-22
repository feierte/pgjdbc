package org.postgresql.demo;

import java.sql.*;
import java.util.Properties;

public class Demo {

  public static void main(String[] args) throws SQLException {
    String url = "jdbc:postgresql://localhost/postgres";
    Properties props = new Properties();
    props.setProperty("user","admin");
    props.setProperty("password","admin");
    Connection conn = DriverManager.getConnection(url, props);

    Statement statement = conn.createStatement();
    ResultSet resultSet = statement.executeQuery("select * from baseline_info");
    while (resultSet.next()) {
      String string = resultSet.getString(1);
      System.out.println("===>" + string);
    }

  }
}
