package org.kj;

import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private List<Module> modules;
    private List<Student> students;
    private DateTime startDate;
    private DateTime endDate;

    public Course(String name, String startDateString, String endDateString) {
        this.name = name;
        this.startDate = DateTime.parse(startDateString);
        this.endDate = DateTime.parse(endDateString);
        this.students = new ArrayList<Student>();
        this.modules = new ArrayList<Module>();
    }

    //Getters

    public String getName() { return name; }
    public List<Module> getModules() { return modules; }
    public List<Student> getStudents() { return students; }
    public DateTime getStartDate() { return startDate; }
    public DateTime getEndDate() { return endDate; }

    //Setters

    public void setName(String name) { this.name = name; }

    public void addModule(Module module) { modules.add(module); }
    public void addStudent(Student student) {
        students.add(student);
        student.addCourse(this);

        for (Module module : modules) {
            student.addModule(module);
        }
    }

    public void setStartDate(DateTime startDate) { this.startDate = startDate; }
    public void setEndDate(DateTime endDate) { this.endDate = endDate; }

}
