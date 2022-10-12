package ProffSkillsAssignment1;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;
public class AppTest{
    
   
    
    
    
    public static void main(String[] args){
       
        ArrayList<Module> modList =new ArrayList<Module>();
        ArrayList<Course> courseList = new ArrayList<Course>();
        ArrayList<Student> studentList = new ArrayList<Student>();
        
        
        LocalDate DOB=LocalDate.of(2001, 1, 8);
        Student student1 = new Student("Bob",21, DOB,135243,modList,courseList);
        Lecturer l1=new Lecturer("John Smith",34,DOB,676765,modList);
        Module mod1 = new Module("data stuctures",4316,studentList,courseList,l1);
        modList.add(mod1);
        
        //testGetUsername();
    } 
    
    
    
    public void testGetUsername() {
        
        System.out.println("equal");
        
        int[] a = null;
        int[] b = null;
        boolean expResult = false;
        boolean result = a.equals(b);
        assertEquals(expResult, result);
        fail("jshjsjhk");
        
    }

    
}