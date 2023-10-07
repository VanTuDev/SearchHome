package dao;

import context.DBContext;
import static context.DBContext.closeConnection;
import static context.DBContext.setConnection;

import entity.Accounts;
import entity.Category;
import entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAO {

    Connection conn = DBContext.getConnection(); // câu lệnh kết nối 
    PreparedStatement ps = null; //ném câu lệnh query 
    ResultSet rs = null; // nhận kết quả trả về

    public ArrayList<Accounts> selectAllAccounts() {
        ArrayList<Accounts> listAccounts = new ArrayList<Accounts>();
        String query = "SELECT * FROM Accounts";

        try {
            // bước 1: kết nối đến CSDL
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                listAccounts.add(new Accounts(
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getString(8),
                    rs.getString(9),
                    rs.getString(10),
                    rs.getString(11),
                    rs.getString(12),
                    rs.getString(13),
                    rs.getString(14),
                    rs.getString(15),
                    rs.getString(16),
                    rs.getString(17),
                    rs.getString(18)));

            }
        } catch (Exception ex) {
            // Thông báo lỗi ra 
            ex.printStackTrace();
        }
        return listAccounts;

    }

//    public static void main(String[] args) {
//        DBContext.setConnection();
//        DAO dao = new DAO();
//        List<Accounts> listAccounts = dao.selectAllAccounts();
//        for (Accounts accounts : listAccounts) {
//            System.out.println(accounts);
//
//        }
//    }
    public List<Product> getAllProduct() {
        List<Product> list = new ArrayList<>();
        String query = "select * from Product";

        try {
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getDouble(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getString(8),
                    rs.getString(9),
                    rs.getString(10),
                    rs.getString(11),
                    rs.getString(12),
                    rs.getString(13),
                    rs.getString(14)
                ));
            }
            // in ra lỗi nếu không thể seclect table "product"
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }

    //test đã đẩy dữ liệu từ sql Products lên chưa
//    public static void main(String[] args) {
//        DBContext.setConnection();
//        DAO dao = new DAO();
//        List<Product> listP = dao.getAllProduct();
//        for (Product Product : listP) {
//            System.out.println(Product);
//
//        }
//    }
    public List<Category> getAllCategory() {
        List<Category> list = new ArrayList<>();
        String query = "select * from Category";
        try {
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Category(rs.getInt(1),
                    rs.getString(2)));
            }
            // in ra lỗi nếu không thể seclect table "Category"
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }

    // test đã đẩy dữ liệu từ sql Category lên chưa
//    public static void main(String[] args) {
//        DBContext.setConnection();
//        DAO dao = new DAO();
//        List<Category> listCC = dao.getAllCategory();
//        for (Category Category : listCC) {
//            System.out.println(Category);
//
//        }
//
//        // in ra  Product
//        List<Product> listP = dao.getAllProduct();
//        for (Product Product : listP) {
//            System.out.println(Product);
//        }
//    }
    public Product getLast() {

        String query = " select top 1 *  from product\n"
            + "order by id desc ";

        try {

            Connection conn = DBContext.getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Product(rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getDouble(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getString(8),
                    rs.getString(9),
                    rs.getString(10),
                    rs.getString(11),
                    rs.getString(12),
                    rs.getString(13),
                    rs.getString(14)
                );
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return null;
    }

    public List<Product> getProductByCID(String cid) {
        List<Product> list = new ArrayList<>();
        String query = "select * from product where cateID = ?";
        try {
            Connection conn = DBContext.getConnection();
            ps = conn.prepareStatement(query);

            if (cid != null) {
                ps.setString(1, cid);
                rs = ps.executeQuery();

                while (rs.next()) {
                    list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11),
                        rs.getString(12),
                        rs.getString(13),
                        rs.getString(14)
                    ));
                }
            } else {

                System.out.println("CID không hợp lệ");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }

    public List<Product> getProductByUser(String user) {
        List<Product> list = new ArrayList<>();
        String query = "SELECT * FROM product where [user]= ? ";
        try {
            Connection conn = DBContext.getConnection();
            ps = conn.prepareStatement(query);

            if (user != null) {
                ps.setString(1, user);
                rs = ps.executeQuery();

                while (rs.next()) {
                    list.add(new Product(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getString(9),
                        rs.getString(10),
                        rs.getString(11),
                        rs.getString(12),
                        rs.getString(13),
                        rs.getString(14)
                    ));
                }
            } else {

                System.out.println("CID không hợp lệ");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return list;
    }

//    public static void main(String[] args) {
//        // Mở kết nối đến cơ sở dữ liệu
//        DBContext.setConnection();
//        
//        DAO dao = new DAO();
//        
//        // Thay thế "your_cid_here" bằng giá trị mã danh mục (Category ID) mà bạn muốn truy vấn
//        String user = "lehieu";
//        
//        List<Product> productsByCategory = dao.getProductByUser(user);
//        
//        if (productsByCategory.isEmpty()) {
//            System.out.println("Không tìm thấy sản phẩm cho Category ID: " + user);
//        } else {
//            System.out.println("Danh sách sản phẩm cho Category ID: " + user);
//            for (Product product : productsByCategory) {
//                System.out.println("ID: " + product.getId());
//                System.out.println("Tên sản phẩm: " + product.getName());
//                System.out.println("Giá: " + product.getPrice());
//                System.out.println("Mô tả: " + product.getDescription());
//                System.out.println("-------------------------------");
//            }
//        }
//        
//        // Đóng kết nối đến cơ sở dữ liệu
//        DBContext.closeConnection();
//    }
    public int deletePost(String id) {
        int ketQua = 0;
        ps = null;
        try {
            String query = "DELETE from product \n"
                + " WHERE id = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, id);
            System.out.println(query);
            ketQua = ps.executeUpdate();
            System.out.println("Bạn đã thực thi: " + query);
            System.out.println("Có " + ketQua + " dòng bị thay đổi!");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ketQua;
    }

//    public void createPost(Product product) {
//        int ketQua = 0;
//        ps = null;
//        String query = "INSERT INTO product (name, image, price, title, description, cateID, user)\n"
//            + "  VALUES (?,?,?,?,?,?)";
//        try {
//            conn = new DBContext().getConnection();
//            ps = conn.prepareStatement(query);
//            ps.setString(1, product.getName());
//            ps.setString(2, product.getImage());
//            ps.setDouble(3, product.getPrice());
//            ps.setString(4, product.getTitle());
//            ps.setString(5, product.getDescription());
//            ps.setString(6, product.getCateID());
//            ps.setString(7, product.getUser());
//
//            System.out.println(product.getName());
//            System.out.println(product.getImage());
//            System.out.println(product.getPrice());
//            System.out.println(product.getTitle());
//            System.out.println(product.getDescription());
//            System.out.println(product.getCateID());
//            System.out.println(product.getUser());
//            System.out.println("Product inserted successfully.");
//            ps.executeUpdate();
//
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//    }

//    public static void main(String[] args) {
//        DBContext.setConnection();
//        // Create a Product object with the necessary data
//        Product product = new Product();
//        product.setName("nhabdhasbds");
//        product.setImage("example.jpg");
//        product.setPrice(12.99);
//        product.setTitle("Example Title");
//        product.setDescription("This is an example product description.");
//        product.setCateID("1");
//
//        // Create an instance of the DAO class
//        DAO dao = new DAO();
//
//        // Call the createPost method to insert the product into the database
//        dao.createPost(product);
//
//        // Optionally, you can print a message to confirm the insertion
//        System.out.println("Product inserted successfully.");
//        DBContext.closeConnection();
//    }

    public void createPost(String name, String image, String price, String title, String description, String cateId, String user) {
        String query = "INSERT INTO [Wish].[dbo].[product] \n"
            + "([name],[image],[price],[title],[description],[cateID],[user])\n"
            + "VALUES (?,?,?,?,?,?,?)";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, image);
            ps.setString(3, price);
            ps.setString(4, title);
            ps.setString(5, description);
            ps.setString(6, cateId);
            ps.setString(7, user);
            ps.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
//    public static void main(String[] args) {
//        
//    }
//    public static void main(String[] args) {
//        DBContext.setConnection();
//        Product id = new Product();
//        id.setId(24);
//        DAO dao = new DAO();
//        int ketQua = dao.deletePost("24");
//        if (ketQua > 0) {
//            System.out.println("Xóa tác giả thành công");
//        } else {
//            System.out.println("Xóa tác giả thất bại hoặc không tìm thấy tác giả");
//        }
//        DBContext.closeConnection();
//    }
    public Product getProductByID(String id) {

        String query = "select *from product\n"
            + " where id = ?";

        try {
            Connection conn = DBContext.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Product(rs.getInt(1), rs.getString(2),
                    rs.getString(3), rs.getInt(4), rs.getString(5),
                    rs.getString(6), rs.getString(7),
                    rs.getString(8),
                    rs.getString(9),
                    rs.getString(10),
                    rs.getString(11),
                    rs.getString(12),
                    rs.getString(13),
                    rs.getString(14));
            }
            // in ra lỗi nếu không thể seclect table "product"
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;

    }

//    public static void main(String[] args) {
//        // Mở kết nối đến cơ sở dữ liệu
//        DBContext.setConnection();
//
//        DAO dao = new DAO();
//
//        // Thay thế "your_product_id_here" bằng mã sản phẩm (Product ID) mà bạn muốn truy vấn
//        String productId = "1";
//
//        Product product = dao.getProductByID(productId);
//
//        if (product != null) {
//            System.out.println("Thông tin sản phẩm:");
//            System.out.println("ID: " + product.getId());
//            System.out.println("Tên sản phẩm: " + product.getName());
//            System.out.println("Giá: " + product.getPrice());
//            System.out.println("Mô tả: " + product.getDescription());
//            System.out.println("ảnh " + product.getImage());
//            System.out.println("ảnh1 " + product.getImage1());
//            System.out.println("ảnh2 " + product.getImage2());
//            System.out.println("ảnh3 " + product.getImage3());
//            System.out.println("ảnh4 " + product.getImage4());
//            System.out.println("ảnh5 " + product.getImage5());
//
//        } else {
//            System.out.println("Không tìm thấy sản phẩm có ID: " + productId);
//        }
//
//        // Đóng kết nối đến cơ sở dữ liệu
//        DBContext.closeConnection();
//    }
    public Accounts login(String user, String pass) {
        String query = "select * from accounts\n"
            + " where [user] = ?\n"
            + " and pass = ?";
        try {
            Connection conn = DBContext.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            rs = ps.executeQuery();

            while (rs.next()) {
                return new Accounts(rs.getString(1),
                    rs.getString(1),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getString(8),
                    rs.getString(9),
                    rs.getString(10),
                    rs.getString(11),
                    rs.getString(12),
                    rs.getString(13),
                    rs.getString(14),
                    rs.getString(15),
                    rs.getString(16),
                    rs.getString(17),
                    rs.getString(18));

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    // check tài khoản mật khẩu
//   public static void main(String[] args) {
//    DBContext.setConnection();
//    DAO dao = new DAO();
//    String user = "vantu"; // Thay thế bằng tên đăng nhập thực tế của bạn
//    String pass = "123"; // Thay thế bằng mật khẩu thực tế của bạn
//    Accounts accounts = dao.login(user, pass);
//
//    if (accounts != null) {
//        System.out.println("Đăng nhập thành công!");
//        System.out.println("Thông tin tài khoản:");
//        System.out.println("Tên đăng nhập: " + accounts.getUser());
//        System.out.println("Mật khẩu: " + accounts.getPass());
//        System.out.println("Renter: " + accounts.getRenter());
//        System.out.println("Lessor: " + accounts.getLessor());
//        System.out.println("Admins: " + accounts.getAdmins());
//    } else {
//        System.out.println("Đăng nhập thất bại");
//    }
//}
    public Accounts checkAccountsExits(String user) {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            String query = "select * from accounts\n"
                + " where [user] = ?\n";

            conn = DBContext.getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, user);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Accounts(rs.getString(1),
                    rs.getString(1),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                    rs.getString(8),
                    rs.getString(9),
                    rs.getString(10),
                    rs.getString(11),
                    rs.getString(12),
                    rs.getString(13),
                    rs.getString(14),
                    rs.getString(15),
                    rs.getString(16),
                    rs.getString(17),
                    rs.getString(18));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

//    public static void main(String[] args) {
//        DBContext.setConnection();
//        DAO dao = new DAO();
//        String user = "vantu"; // Thay thế bằng tên đăng nhập thực tế của bạn
//        Accounts accounts = dao.checkAccountsExits(user);
//        if (accounts != null) {
//            System.out.println("thành công!");
//            System.out.println("Tài Khoản này có trong hệ thống:");
//            System.out.println("Tên đăng nhập: " + accounts.getUser());
//            System.out.println(" Mật khẩu là : " + accounts.getPass());
//            System.out.println("Renter: " + accounts.getRenter());
//            System.out.println("Lessor: " + accounts.getLessor());
//            
//        } else {
//            System.out.println("Đăng nhập thất bại");
//        }
//    }
    // Đây là hàm checkAccountsExits được đưa vào từ mã trước đó
    public int singup(Accounts accounts) {
        int listAccounts = 0;
        Connection conn = null;
        try {
            conn = DBContext.getConnection();
            String query = "  INSERT INTO accounts ([user],fullname,gender,gmail,pass,roles,numphone,cccd,dot,wot)\n"
                + "  VALUES (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, accounts.getUser());
            ps.setString(2, accounts.getFullname());
            ps.setString(3, accounts.getGender());
            ps.setString(4, accounts.getGmail());
            ps.setString(5, accounts.getPass());
            ps.setString(6, accounts.getRoles());
            ps.setString(7, accounts.getNumphone());
            ps.setString(8, accounts.getCccd());
            ps.setString(9, accounts.getDot());
            ps.setString(10, accounts.getWot());

            System.out.println(accounts.getGmail());
            System.out.println(accounts.getPass());

            // Bước 3: thực thi câu lệnh SQL
            listAccounts = ps.executeUpdate();

            // Bước 4:
            System.out.println("Bạn đã thực thi: " + query);
            System.out.println("Có " + listAccounts + " dòng bị thay đổi!");

            DBContext.closeConnection();
        } catch (Exception ex) {
            // Xử lý lỗi
            ex.printStackTrace();
        } finally {
            // Đảm bảo rằng kết nối được đóng ngay cả khi xảy ra lỗi
            DBContext.closeConnection();
        }

        return listAccounts;
    }

//    public static void main(String[] args) {
//        try {
//            DAO dao = new DAO();
//            Accounts accounts = new Accounts("Quang", "123", 0, 0, 0, "VanHei@gmail.com");
//
//            // Tạo kết nối đến CSDL
//            DBContext.setConnection();
//
//            // Gọi phương thức insert
//            int singup = dao.singup(accounts);
//
//            // Kiểm tra kết quả
//            if (singup > 0) {
//                System.out.println("Thêm thành công.");
//            } else {
//                System.out.println("Thêm không thành công.");
//            }
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        } finally {
//            // Đảm bảo đóng kết nối sau khi hoàn thành
//            DBContext.closeConnection();
//        }
//    }
    public int inserfavoritepost(Accounts accounts) {
        int listAccounts = 0;
        Connection conn = null;
        try {
            conn = DBContext.getConnection();
            String query = "  INSERT INTO favaritepost (idfavorite, idpost, user,\n"
                + "  VALUES (?,?,?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, accounts.getUser());
            ps.setString(2, accounts.getFullname());
            ps.setString(3, accounts.getGender());

            System.out.println(accounts.getGmail());
            System.out.println(accounts.getPass());

            // Bước 3: thực thi câu lệnh SQL
            listAccounts = ps.executeUpdate();

            // Bước 4:
            System.out.println("Bạn đã thực thi: " + query);
            System.out.println("Có " + listAccounts + " dòng bị thay đổi!");

            DBContext.closeConnection();
        } catch (Exception ex) {
            // Xử lý lỗi
            ex.printStackTrace();
        } finally {
            // Đảm bảo rằng kết nối được đóng ngay cả khi xảy ra lỗi
            DBContext.closeConnection();
        }

        return listAccounts;
    }

    public int updateVeryfyInformation(Accounts accounts) {
        int listAccounts = 0;
        try {

            conn = DBContext.getConnection();
            String query = "UPDATE accounts"
                + "SET " + "maxacthuc = ?"
                + ",thoigianhieuluccuamaxacthuc"
                + ",trangthaixacthuc" + "WHERE user";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, accounts.getMaxacthuc());
            ps.setString(2, accounts.getThoigianhieuluccuamaxacthuc());
            ps.setString(3, accounts.isTrangthaixacthuc());
            ps.setString(4, accounts.getUser());
//            System.out.println(accounts.getMaxacthuc());
//            System.out.println(accounts.getThoigianhieuluccuamaxacthuc());
//            System.out.println(accounts.isTrangthaixacthuc());
//            System.out.println(accounts.getUser());

            // Bước 3: thực thi câu lệnh SQL
            listAccounts = ps.executeUpdate();

            // Bước 4:
            System.out.println("Bạn đã thực thi: " + query);
            System.out.println("Có " + listAccounts + " dòng bị thay đổi!");

            DBContext.closeConnection();
        } catch (Exception e) {
        }
        return 0;

    }
}
