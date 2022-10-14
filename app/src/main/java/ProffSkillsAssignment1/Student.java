
package ProffSkillsAssignment1;
import java.time.LocalDate;
import java.util.ArrayList;
/**
 *
 * @author eamon
 */
public class Student {
    String name;
    int age;
    LocalDate DOB;
    int ID;
    String username;
    ArrayList<Module> myModules;
    ArrayList<Course> myCourses;
    
    public Student(String name,int age,LocalDate DOB,int ID,ArrayList<Module> myModules,ArrayList<Course> myCourses)
    {
        this.name=name;
        this.age=age;
        this.DOB=DOB;
        this.ID=ID;
        username=this.getUsername();
        this.myModules = myModules;
        this.myCourses = myCourses;
    };
    
    public String getUsername()
    {
       
        return name+age;
        
    }
    
    @Override
    public String toString() {
        String strng="";
        strng+=name+"\nModules:\n";
        for (Module mod : myModules){
            strng+=mod.getName()+"\n";
        }  
        strng+="\nCourse(s):";
        for (Course c : myCourses){
            strng+=c.getName()+"\n";
        }    
        return strng; 
    }
    
}
