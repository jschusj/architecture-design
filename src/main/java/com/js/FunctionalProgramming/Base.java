package com.js.FunctionalProgramming;

import java.util.List;

/**
 * @Author：YangTao
 * @Date：2025/2/20 20:44
 */
public class Base {

    public static List<Student> students;

    static {
        students.add(new Student(1L, "张三", 1L, 1L));
        students.add(new Student(1L, "李四", 1L, 1L));
    }

}
