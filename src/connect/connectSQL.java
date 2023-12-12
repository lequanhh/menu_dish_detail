package connect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class connectSQL {
    private Connection connection;
    private Statement statement;

    public connectSQL() {
        try {
            String url = "jdbc:mysql://localhost:3306/menu";
            String username = "root";
            String password = "root";

            connection = DriverManager.getConnection(url, username, password);
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet executeQuery(String query) {
        try {
            return statement.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}