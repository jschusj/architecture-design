package com.js.FunctionalProgramming;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@RunWith(MockitoJUnitRunner.class)
public class FunctionalProgrammingTest {

    @InjectMocks
    private FunctionalProgramming functionalProgramming;

    private List<Student> students;

    @Before
    public void setUp() {
        students = new ArrayList<>();
        students.add(new Student(1L, "Alice", 1L, 101L));
        students.add(new Student(2L, "Bob", 2L, 102L));
        students.add(new Student(3L, "Charlie", 3L, 103L));
        functionalProgramming.setStudents(students);
    }

    @Test
    public void findByName_StudentExists_ReturnsStudent() {
        Student result = functionalProgramming.findByName("Bob");
        assertEquals("Bob", result.getName());
    }

    @Test
    public void findByName_StudentDoesNotExist_ReturnsNull() {
        Student result = functionalProgramming.findByName("David");
        assertNull(result);
    }

    @Test
    public void findByName_EmptyList_ReturnsNull() {
        functionalProgramming.setStudents(new ArrayList<>());
        Student result = functionalProgramming.findByName("Alice");
        assertNull(result);
    }
}
