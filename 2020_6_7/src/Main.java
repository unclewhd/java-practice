import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class<?> cls = Class.forName("com.mysql.jdbc.Driver");
        System.out.println(cls.getSimpleName());



        String defaultDatabaseName = "whd";
        String password = "wwhhdd112233" ;

        String user = "root";
        String url = "jdbc:mysql://127.0.0.1:3306/"+defaultDatabaseName
                +"?useSSL=false&characterEncoding=utf8";
        Connection connection = DriverManager.getConnection(url,user,password);
        System.out.println(connection);

        Statement statement = connection.createStatement();
        String sql = "select * from student";
        ResultSet resultSet = statement.executeQuery(sql);
        int count = 0;
        System.out.println("+-------+-------+-------+");
        System.out.println("+id_____-+sn---+-name----sex");
        System.out.println("+-------+-------+-------+");
        while(resultSet.next()) {
            String id = resultSet.getString(1);
            String sn = resultSet.getString(2);
            String name = resultSet.getString(3);
            String sex = resultSet.getString(4);

            System.out.format("| %2s | %4s | %-7s | %2s|%n",id,sn,name,sex);
            count++;
        }
        System.out.println("+-----------+---------+----------+");
        resultSet.close();
        // -2. 关闭 statement 对象
        statement.close();

        // -1. 关闭刚才的连接
        connection.close();
    }
}
