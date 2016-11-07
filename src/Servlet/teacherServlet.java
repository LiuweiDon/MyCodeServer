package Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import Class.teacherSolve;
import DAO.teacherInfo;
import Util.JsonUtil;
import org.json.JSONException;

@WebServlet(name = "teacherServlet")
public class teacherServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");

        String jsonStr = request.getParameter("json");

        System.out.println(jsonStr);

        teacherSolve solve = new teacherSolve();
        solve.solve(jsonStr);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

// {"MAC":"88:6A:B1:15:46:5F","bName":"gg","cName":"gg","randNum":"37649588"}