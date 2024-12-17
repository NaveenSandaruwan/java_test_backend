import java.sql.*;
public class JDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/food_app";
        String user = "root";
        String pw = "@data123";
        String qwery = "select * from categories";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection =DriverManager.getConnection(url,user,pw);
            Statement statement =connection.createStatement();

            ResultSet resultSet =statement.executeQuery(qwery);
            String name;
            int id;
            while (resultSet.next()){
                id= resultSet.getInt(1);
                name = resultSet.getString(2);
                System.out.println(id+" "+name);
            }
            connection.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
