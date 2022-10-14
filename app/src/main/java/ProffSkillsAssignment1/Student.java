
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
    Course myCourse;
    
    public Student(String name,int age,LocalDate DOB,int ID,ArrayList<Module> myModules,Course myCourse)
    {
        this.name=name;
        this.age=age;
        this.DOB=DOB;
        this.ID=ID;
        username=this.getUsername();
        this.myModules = myModules;
        this.myCourse = myCourse;
    };
    
    public String getUsername()
    {
       
        return name+age;
        
    }
    
    @Override
    public String toString() {
        String strng="";
        strng+=this.getUsername()+"\nModules:\n";
        for (Module mod : myModules){
            strng+=mod.getName()+"\n";
        }  
        strng+="\nCourse: "+ myCourse.getName();
        
        return strng; 
    }
    
}
