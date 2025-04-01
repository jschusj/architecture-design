package com.js.FunctionalProgramming;

import java.util.List;

/**
 * @Author：YangTao
 * @Date：2025/2/20 20:51
 */
public class FunctionalProgramming extends Base {

    Student find(final Predicate<Student> predicate) {
        for (Student student : students) {
            if (predicate.test(student)) {
                return student;
            }
        }

        return null;
    }

    Student findByName(final String name) {
        return find(new Predicate<Student>() {
            @Override
            public boolean test(final Student student) {
                return name.equals(student.getName());
            }
        });
    }

    public void setStudents(List<Student> students) {
        Base.students = students;
    }
}
