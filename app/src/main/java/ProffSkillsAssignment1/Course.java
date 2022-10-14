package ProffSkillsAssignment1;
import java.time.LocalDate;
import java.util.ArrayList;
import org.joda.time.*;
/**
 *
 * @author eamon
 */
public class Course {
    private String name;
    private ArrayList<Module> modules =new ArrayList<Module>();
    private ArrayList<Student> students =new ArrayList<Student>();
    
    private LocalDate start;
    private LocalDate finish;
    
    
    public Course(String name, ArrayList<Module> modules,LocalDate start,LocalDate finish){
        
        this.name = name;
        this .modules = modules;
        this.start = start;
        this.finish=finish;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public LocalDate getStart() {
        return start;
    }

    public LocalDate getFinish() {
        return finish;
    }

    @Override
    public String toString() {
        String strng="";
        strng+=name+"\nModules:\n";
        for (Module mod : modules){
            strng+=mod.getName()+"\n";
        }        
        return strng; 
    }
        
    
    
    
    
    
}
