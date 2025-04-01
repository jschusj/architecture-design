package com.js.FunctionalProgramming;

import static com.js.FunctionalProgramming.Base.students;

/**
 * @Author：YangTao
 * @Date：2025/2/20 20:42
 */
public class StructuredProgramming {

    Student findByName(final String name) {
        for (Student student : students) {
            if (name.equals(student.getName())) {
                return student;
            }
        }
        return null;
    }

    Student findBySno(final long sno) {
        for (Student student : students) {
            if (sno == student.getSno()) {
                return student;
            }
        }
        return null;
    }

    Student findById(final long id) {
        for (Student student : students) {
            if (id == student.getId()) {
                return student;
            }
        }
        return null;
    }

}
