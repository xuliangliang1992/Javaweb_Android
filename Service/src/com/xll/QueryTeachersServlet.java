package com.xll;

import com.google.gson.Gson;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class QueryTeachersServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain; charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");
        req.setCharacterEncoding("UTF-8");
        // 将数据添加到数组
        SchoolDao dao = new SchoolDao();
        List<Teacher> teacherList = new ArrayList<>();
        try {
            teacherList = dao.getAllTeachers();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // 将数据封装到教师总计类
        TeacherTotal teacherTotal = new TeacherTotal(teacherList.size(), teacherList);

        // 调用GSON jar工具包封装好的toJson方法，可直接生成JSON字符串
        Gson gson = new Gson();
        String json = gson.toJson(teacherTotal);

        // 输出到界面
        System.out.println(json);

        PrintWriter out = new PrintWriter(resp.getOutputStream());
        out.print(json);
        out.flush();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
