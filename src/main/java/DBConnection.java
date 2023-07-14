import com.zaxxer.hikari.*;
import java.sql.*;
public class DBConnection {
    private static HikariConfig config = new HikariConfig();
    private static HikariDataSource dataSource;
    public static Connection getConnection() {
        config.setJdbcUrl("jdbc:mysql://localhost:3306/Employee");
        config.setUsername("root");
        config.setPassword("#Pirates20");
        dataSource = new HikariDataSource(config);
        try {
            Connection connection = dataSource.getConnection();
            return connection;
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void closeConnection() {
        dataSource.close();
    }
}
