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
 * @author eamon
 */
public class LecturerTest {
    
    public LecturerTest() {
    }
    
    

    /**
     * Test of getUsername method, of class Lecturer.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        
        LocalDate DOB=LocalDate.of(2001, 1, 8);
        ArrayList<Module> modList =new ArrayList<Module>();
        Lecturer l1=new Lecturer("JohnSmith",34,DOB,676765,modList);
        
        String expResult = "JohnSmith34";
        String result = l1.getUsername();
        assertEquals(expResult, result);
        
    }
    
}
