package control;

import context.DBContext;
import dao.DAO;
import entity.Accounts;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "LoginControl", urlPatterns = {"/login"})
public class LoginControl extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        DBContext.setConnection();
        response.setContentType("text/html;charset=UTF-8");
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");

        if (user != null && pass != null) {

            DAO dao = new DAO();
            Accounts accounts = dao.login(user, pass);

            if (accounts != null) {
                // Đăng nhập thành công, chuyển hướng đến trang home
                HttpSession session = request.getSession();
                session.setAttribute("acc", accounts);
                request.getRequestDispatcher("home").forward(request, response);

            } else {
                // Không tìm thấy tài khoản, gửi thông báo lỗi đến trang login.jsp
                request.setAttribute("mess", "Không tìm thấy tài khoản của bạn");
                request.getRequestDispatcher("login.jsp").forward(request, response);
                
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
