package dbhelper;

import java.sql.*;
public class DatabaseInitilization {
        private String driver="com.mysql.jdbc.Driver";
        private String db_first="jdbc:mysql://localhost:3306/";
        private String db_url="jdbc:mysql://localhost:3306/EmployeeDb";
        private String db_username="root";
        private String db_password="";
        Statement stmt,statement;
        Connection conn;

        public void createDatabase(){
            try{
                Class.forName(driver);
                conn=DriverManager.getConnection(db_first,db_username,db_password);
                stmt=conn.createStatement();
                stmt.executeUpdate("Create database if not exists EmployeeDb");
                conn.close();
            }catch(Exception e){
                System.out.println(e);
            }
        }
    public void createConnection(){
        try{
            Class.forName(driver);
            Connection conn=DriverManager.getConnection(db_url,db_username,db_password);
            stmt=conn.createStatement();
            statement=conn.createStatement();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void createTable(){
            createConnection();
    }
}
