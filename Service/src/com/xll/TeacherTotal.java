package com.xll;

import java.util.List;

public class TeacherTotal {
    /**
     * 教师数量
     */
    private int total;
    /**
     * 教师列表
     */
    private List<Teacher> teachers;

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
