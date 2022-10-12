package ProffSkillsAssignment1;
import java.time.LocalDate;
import java.util.*;
/**
 *
 * @author eamon
 */
public class Lecturer {
    String name;
    int age;
    LocalDate DOB;
    int ID;
    String username;
    
    ArrayList<Module> myModules;
    
    
    public Lecturer(String name,int age,LocalDate DOB,int ID, ArrayList<Module>  myModules)   
    {
        this.name=name;
        this.age=age;
        this.DOB=DOB;
        this.ID=ID;
        this.myModules = myModules;
        username=this.getUsername();
    };
    
    public String getUsername()
    {
       
        return name+age;
        
    }
    
}
