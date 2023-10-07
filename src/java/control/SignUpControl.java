/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package control;

import context.DBContext;
import dao.DAO;
import entity.Accounts;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SignUpControl", urlPatterns = {"/signup"})
public class SignUpControl extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        DBContext.setConnection();
        response.setContentType("text/html;charset=UTF-8");  
        request.setCharacterEncoding("UTF-8");
        String user = request.getParameter("user");
        String pass = request.getParameter("pass");
        String gmail = request.getParameter("gmail");
        String fullname = request.getParameter("fullname");
        String gender = request.getParameter("gender");
        String cccd = request.getParameter("cccd");
        String numphone = request.getParameter("numphone");
        String roles = request.getParameter("roles");
        String dot = request.getParameter("dot");
        String wot = request.getParameter("wot");
        
        System.out.println(user);
        System.out.println(pass);
        System.out.println(gmail);
        System.out.println( fullname);
        System.out.println(gender);
        System.out.println(cccd);
        System.out.println(roles);
        System.out.println(dot);
        System.out.println(wot);

        String repass = request.getParameter("repass");
        if (!pass.equals(repass)) {
            request.getParameter("login.jsp");
        } else {
            DAO dao = new DAO();
            Accounts accounts = dao.checkAccountsExits(user);
            
            if (accounts == null) {
                Date thoigianhieuluccuamaxacthuc = null;
                // được đăng kí
                Accounts acc = new Accounts(user, pass, gender, gender, repass, wot, fullname, dot, gender, numphone, cccd, gmail, roles, dot, wot, repass, fullname, gmail);
                dao.singup(acc);
                response.sendRedirect("home");

            } else {
                // đẩy về trang register.jsp

                response.sendRedirect("login.jsp");
            }

        }

        //signup
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        processRequest(request, response);
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
