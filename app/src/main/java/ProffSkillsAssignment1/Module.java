package ProffSkillsAssignment1;
import java.util.ArrayList;
/**
 *
 * @author eamon
 */
public class Module {
    
    String name;
    int ID;
    ArrayList<Student> students;
    ArrayList<Course> courses;
    Lecturer lecturer;
    public Module(String name,int ID,ArrayList<Student> students,ArrayList<Course> courses,Lecturer lecturer)
    {
        this.name= name;
        this.ID= ID;
        this.students= students ;
        this.courses=  courses;      
        this.lecturer= lecturer;
        
        
               
                
                
    };
    
}
