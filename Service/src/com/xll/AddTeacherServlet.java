package com.xll;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

public class AddTeacherServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain; charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");
        req.setCharacterEncoding("UTF-8");

        String name = req.getParameter("name");
        String sex = req.getParameter("sex");
        Integer age = Integer.parseInt(req.getParameter("age"));
        String tel = req.getParameter("tel");
        String project = req.getParameter("project");

        Teacher teacher = new Teacher();
        teacher.setName(name);
        teacher.setAge(age);
        teacher.setSex(sex);
        teacher.setTel(tel);
        teacher.setProject(project);
        PrintWriter out = new PrintWriter(resp.getOutputStream());
        // 将数据添加到数组
        SchoolDao dao = new SchoolDao();
        try {
            dao.addTeacher(teacher);
            out.print("hah哈哈哈ahahaha ");
        } catch (SQLException e) {
            e.printStackTrace();
            out.print("failed");
        }

        out.flush();
    }

}
