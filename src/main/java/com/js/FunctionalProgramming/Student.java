package com.js.FunctionalProgramming;


import lombok.AllArgsConstructor;
import lombok.Data;

// 单个学生的定义
@Data
@AllArgsConstructor
class Student {
    // 实体 ID
    private long id;
    // 学生姓名
    private String name;
    // 学号
    private long sno;
    // 年龄
    private long age;
}
