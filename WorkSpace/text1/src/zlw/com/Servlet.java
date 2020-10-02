package zlw.com;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
@WebServlet("/formdata")
public class Servlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String sname = request.getParameter("name");
        String sPid = request.getParameter("pid");
        response.getWriter().write(sname + "----" + sPid);
    }
}