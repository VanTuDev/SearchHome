package control;

import context.DBContext;
import entity.Category;
import entity.Product;
import dao.DAO; // Thay thế DAO bằng gói DAO thực tế của bạn

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "LeftControl", urlPatterns = {"/left"})
public class LeftControl extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        DAO dao = new DAO(); // Thay thế DAO bằng lớp DAO của bạn
        DBContext.setConnection();
        // Lấy danh sách sản phẩm
        List<Category> listCC = dao.getAllCategory();

        request.setAttribute("listCC", listCC);

        // Lấy sản phẩm nổi bật (có thể là sản phẩm mới nhất, bán chạy nhất, ...)
        Product p = dao.getLast(); // Thay thế bằng cách lấy sản phẩm nổi bật của bạn
        request.setAttribute("p", p);

        // Chuyển hướng đến trang Left.jsp
        request.getRequestDispatcher("Left.jsp").forward(request, response);
    }
}
