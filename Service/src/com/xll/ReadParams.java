package com.xll;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

public class ReadParams  extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ReadParams() {
        super();
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain");
        resp.setCharacterEncoding("utf-8");

        /*String userName = req.getParameter("userName");
        String password = req.getParameter("password");
        String sex = req.getParameter("sex");
        System.out.println("用户名:" + userName);
        System.out.println("密  码:" + password);
        System.out.println("性  别:" + sex);
        // 获取参数名为"hobby"的值
        String[] hobbys = req.getParameterValues("hobby");
        System.out.print("爱好:");
        for (int i = 0; i < hobbys.length; i++) {
            System.out.print(hobbys[i]);
            if(i != hobbys.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        String birthday = req.getParameter("birthday");
        System.out.println("密  码:" + birthday);*/
//        String userName = req.getParameter("userName");
//        System.out.println(userName);
        Enumeration<String> enums = req.getParameterNames();
        while (enums.hasMoreElements()){
            String paramName = enums.nextElement();
            String paramValue = req.getParameter(paramName);
            System.out.println(paramName+"="+new String(paramValue.getBytes("iso-8859-1"),"utf-8"));
        }
    }
}
