/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package ProffSkillsAssignment1;

import java.time.LocalDate;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author eamonn
 */
public class StudentTest {
    
    public StudentTest() {
    }
    
    

    /**
     * Test of getUsername method, of class Student.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        
        
        
        ArrayList<Course> courseList = new ArrayList<Course>();
        LocalDate DOB=LocalDate.of(2001, 1, 8);
        ArrayList<Module> modList =new ArrayList<Module>();
        Student student1 = new Student("Bob",21, DOB,135243,modList,courseList);
        
        String expResult = "Bob21";
        String result = student1.getUsername();
        assertEquals(expResult, result);
    }
    
}
