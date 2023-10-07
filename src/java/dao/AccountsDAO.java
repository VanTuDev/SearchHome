//// co sua
//package database;
//
//import context.DBContext;
//import dao.DAO;
//import entity.Accounts;
//import java.sql.Connection;
//import java.sql.Date;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class AccountsDAO {
//
//    public ArrayList<Accounts> data = new ArrayList<>();
//
//    Connection conn = DBContext.getConnection(); // câu lệnh kết nối 
//    PreparedStatement ps = null; //ném câu lệnh query 
//    ResultSet rs = null; // nhận kết quả trả về
//
//    public ArrayList<Accounts> selectAllAccounts() {
//        ArrayList<Accounts> listAccounts = new ArrayList<Accounts>();
//        String query = "SELECT * FROM Accounts";
//
//        try {
//            // bước 1: kết nối đến CSDL
//            ps = conn.prepareStatement(query);
//            rs = ps.executeQuery();
//
//            while (rs.next()) {
//                listAccounts.add(new Accounts(
//                    rs.getString(1),
//                    rs.getString(2),
//                    rs.getInt(3),
//                    rs.getInt(4),
//                    rs.getInt(5),
//                    rs.getString(6),
//                    rs.getString(7),
//                    rs.getString(8),
//                    rs.getString(9),
//                    rs.getString(10),
//                    rs.getString(11),
//                    rs.getString(12),
//                    rs.getString(13),
//                    rs.getString(14),
//                    rs.getString(15),
//                    rs.getString(16),
//                    rs.getString(17),
//                    rs.getInt(18)));
//
//            }
//        } catch (Exception ex) {
//            // Thông báo lỗi ra 
//            ex.printStackTrace();
//        }
//        return listAccounts;
//
//    }
//
////    public static void main(String[] args) {
////        DBContext.setConnection();
////        DAO dao = new DAO();
////        List<Accounts> listAccounts = dao.selectAllAccounts();
////        for (Accounts accounts : listAccounts) {
////            System.out.println(accounts);
////
////        }
////    }
//
//    public Accounts selectById(Accounts accounts) {
//        Accounts listAcounts = null;
//        try {
//            // Bước 1: tạo kết nối đến CSDL
//            Connection con = DBContext.getConnection();
//
//            // Bước 2: tạo ra đối tượng statement
//            String query = "SELECT * FROM accounts WHERE renter=?";
//            PreparedStatement st = con.prepareStatement(query);
//            st.setInt(1, accounts.getRenter());
//
//            // Bước 3: thực thi câu lệnh SQL
//            System.out.println(query);
//            ResultSet rs = st.executeQuery();
//
//            // Bước 4:
//            while (rs.next()) {
//                String user = rs.getString("user");
//                String pass = rs.getString("pass");
//                int renter = rs.getInt("renter");
//                int lessor = rs.getInt("lessor");
//                int admins = rs.getInt("admins");
//                String img = rs.getString("img");
//                String fullname = rs.getString("fullname");
//                String dob = rs.getString("dob");
//                String gender = rs.getString("gender");
//                String numphone = rs.getString("numphone");
//                String cccd = rs.getString("cccd");
//                String gmail = rs.getString("gmail");
//                String roles = rs.getString("roles");
//                String dot = rs.getString("dot");
//                String wot = rs.getString("wot");
//                String maxacthuc = rs.getString("maxacthuc");
//                String thoigianhieuluccuamaxacthuc =rs.getString("thoigianhieuluccuamaxacthuc");
//                int trangthaixacthuc = rs.getInt("trangthaixacthuc");
//                       
//                listAcounts = new Accounts(user, pass, renter, lessor, admins, img, fullname, dob, gender, numphone, cccd, gmail, roles, dot, wot, maxacthuc, thoigianhieuluccuamaxacthuc, trangthaixacthuc); 
//                 }
//
//            // Bước 5:
//            DBContext.closeConnection();
//        } catch (SQLException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//
//        return listAcounts;
//    }
//    public static void main(String[] args) {
//          
//        // Mở kết nối đến cơ sở dữ liệu
//        DBContext.setConnection();
//        
//        DAO dao = new DAO();
//        
//        // Thay thế "your_cid_here" bằng giá trị mã danh mục (Category ID) mà bạn muốn truy vấn
//        String cid = "2";
//        
//        List<Accounts> productsByCategory = dao.getProductByCID(cid);
//        
//        if (productsByCategory.isEmpty()) {
//            System.out.println("Không tìm thấy sản phẩm cho Category ID: " + cid);
//        } else {
//            System.out.println("Danh sách sản phẩm cho Category ID: " + cid);
//            for (Accounts product : productsByCategory) {
//            
//            }
//            
//        }
//        
//        // Đóng kết nối đến cơ sở dữ liệu
//        DBContext.closeConnection();
//    }
//    }
//
