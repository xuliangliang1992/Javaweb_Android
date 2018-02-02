package com.xll;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SchoolDao {

    public void addTeacher(Teacher teacher) throws SQLException {
        //获取连接
        Connection conn = DbUtil.getConnection();
        //sql
        String sql = "INSERT INTO teachers(name, sex, age, tel, project) values (?,?,?,?,?)";
        //预编译
        PreparedStatement ptmt = conn.prepareStatement(sql); //预编译SQL，减少sql执行

        ptmt.setString(1, teacher.getName());
        ptmt.setString(2, teacher.getSex());
        ptmt.setInt(3, teacher.getAge());
        ptmt.setString(4, teacher.getTel());
        ptmt.setString(5, teacher.getProject());

        //执行
        ptmt.execute();
    }

    public void updateTeacher(Teacher teacher,int id) throws SQLException {
        //获取连接
        Connection conn = DbUtil.getConnection();
        //sql
        String sql = "UPDATE teachers set name=?,age=?,sex=?,tel=?,project=? where id=?";
        //预编译
        PreparedStatement ptmt = conn.prepareStatement(sql); //预编译SQL，减少sql执行

        //传参
        ptmt.setInt(6, id);

        //传参
        ptmt.setString(1, teacher.getName());
        ptmt.setInt(2, teacher.getAge());
        ptmt.setString(3, teacher.getSex());
        ptmt.setString(4, teacher.getTel());
        ptmt.setString(5, teacher.getProject());

        //执行
        ptmt.execute();
    }

    public List<Teacher> getAllTeachers() throws SQLException {
        List<Teacher> list = new ArrayList<>();

        //获取连接
        Connection conn = DbUtil.getConnection();
        //sql, 每行加空格
        String sql = "select * from teachers";
        //预编译SQL，减少sql执行
        PreparedStatement ptmt = conn.prepareStatement(sql);
        //执行
        ResultSet rs = ptmt.executeQuery();
        while (rs.next()){
            Teacher t= new Teacher();
            t.setId(rs.getInt("id"));
            t.setName(rs.getString("name"));
            t.setAge(rs.getInt("age"));
            t.setSex(rs.getString("sex"));
            t.setTel(rs.getString("tel"));
            t.setProject(rs.getString("project"));
            list.add(t);
        }
        return list;
    }
    public Teacher get(int id) throws SQLException {
        Teacher t = null;
        //获取连接
        Connection conn = DbUtil.getConnection();
        //sql, 每行加空格
        String sql = "select * from teachers where id=?";
        //预编译SQL，减少sql执行
        PreparedStatement ptmt = conn.prepareStatement(sql);
        ptmt.setInt(1,id);
        //执行
        ResultSet rs = ptmt.executeQuery();
        while (rs.next()){
            t= new Teacher();
            t.setId(rs.getInt("id"));
            t.setName(rs.getString("name"));
            t.setAge(rs.getInt("age"));
            t.setSex(rs.getString("sex"));
            t.setTel(rs.getString("tel"));
            t.setProject(rs.getString("project"));
        }
        return t;
    }

    public void deleteTeacher(int id) throws SQLException{
        //获取连接
        Connection conn = DbUtil.getConnection();
        //sql, 每行加空格
        String sql = "delete from teachers where id=?";
        //预编译SQL，减少sql执行
        PreparedStatement ptmt = conn.prepareStatement(sql);

        //传参
        ptmt.setInt(1, id);

        //执行
        ptmt.execute();
    }
}
