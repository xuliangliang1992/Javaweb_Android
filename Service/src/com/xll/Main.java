package com.xll;

import java.sql.SQLException;

public class Main {


    public static void main(String[] args) throws SQLException {
        SchoolDao dao = new SchoolDao();
        Teacher teacher = new Teacher();
        Teacher teacher2 = new Teacher();
        teacher.setName("徐亮亮");
        teacher.setTel("15021676796");
        teacher.setAge(23);
        teacher.setSex("男");
        teacher.setProject("Android");

//        dao.addTeacher(teacher);
//        dao.updateTeacher(teacher,3);
       teacher2 = dao.getAllTeachers().get(1);
       System.out.print(teacher2+"/n"+dao.getAllTeachers().size());
//        dao.deleteTeacher(5);
    }


}
