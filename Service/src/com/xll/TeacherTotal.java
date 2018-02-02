package com.xll;

import java.util.List;

public class TeacherTotal {
    private int total; //教师数量
    private List<Teacher> teachers; //教师列表


    public TeacherTotal() {
    }

    public TeacherTotal(int total, List<Teacher> teachers) {
        this.total = total;
        this.teachers = teachers;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }
}
