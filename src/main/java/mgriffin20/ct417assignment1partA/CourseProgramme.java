package mgriffin20.ct417assignment1partA;

import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 *
 * @author Meadhbh
 */
public class CourseProgramme {

    private String courseName;
    private List<Module> modules;
    private DateTime startDate, endDate;
    private DateTimeFormatter dtf = DateTimeFormat.forPattern("dd/mm/yyyy");

    public CourseProgramme() {
    }

    public CourseProgramme(String courseName, List<Module> modules, DateTime startDate, DateTime endDate) {
        setCourseName(courseName);
        setModules(modules);
        setStartDate(startDate);
        setEndDate(endDate);
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public List<Module> getModules() {
        return modules;
    }

    public void addModule(Module module) {
        modules.add(module);
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        String moduleInfo = "";

        for (Iterator<Module> it = modules.iterator(); it.hasNext();) {
            Module module = it.next();
            moduleInfo += module.toString();
        }

        return "Course: " + this.getCourseName() + " \nModules: " + moduleInfo + "Start date: " + dtf.print(this.getStartDate()) + "\nEnd date: " + dtf.print(this.getEndDate()) + "\n";
    }
}
