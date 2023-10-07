
package context;

//import context.database.ProductDAO;
import entity.Product;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Driver;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBContext {

    private static String server = "localhost";
    private static String database = "Wish";
    private static String username = "sa";
    private static String password = "123";

    private static Connection conn;

    public static void setConnection() {
        try {
            Class<?> clazz = Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            DriverManager.registerDriver((Driver) clazz.getDeclaredConstructor().newInstance());
            String url = "jdbc:sqlserver://" + server + ";databaseName=" + database + ";user=" + username + ";password=" + password + ";encrypt=true;trustServerCertificate=true";
            conn = DriverManager.getConnection(url);
        } catch (Exception ex) {
            ex.printStackTrace();
            conn = null;
        }
    }

    public static void closeConnection() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
            }
            conn = null;
        }
    }

    public static boolean testConnection() {
        setConnection();
        if (conn != null) {
            closeConnection();
            return true;
        }
        return false;
    }

    public static Connection getConnection() {
        return conn;
    }

    public static void main(String[] args) {
        if (testConnection()) {
            System.out.println("Kết nối với cơ sở dữ liệu thành công.");
        } else {
            System.out.println("Kết nối với cơ sở dữ liệu không thành công.");
        }
    }

}
