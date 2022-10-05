package org.kj;

import org.joda.time.DateTime;
import org.joda.time.Years;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String fName;
    private String lName;
    private DateTime dob;
    private String id;
    private List<Course> courses;
    private List<Module> modules;

    public Student(String fName, String lName, DateTime dob, String id) {
        this.fName = fName;
        this.lName = lName;
        this.dob = dob;
        this.id = id;
        this.courses = new ArrayList<Course>();
        this.modules = new ArrayList<Module>();
    }

    //Getters

    public String getFirstName() { return fName; }
    public String getLastName() { return lName; }
    public String getFullName() { return fName + ' ' + lName; }

    public DateTime getDob() { return dob; }
    public int getAge() { return Years.yearsBetween(DateTime.now(), dob).getYears(); }
    public String getId() { return id; }
    public String getUsername() { return fName + lName + getAge(); }
    public List<Course> getCourses() { return courses; }
    public List<Module> getModules() { return modules; }

    //Setters

    public void setFirstName(String fName) { this.fName = fName; }
    public void setLastName(String lName) { this.lName = lName; }

    public void setDob(DateTime dob) { this.dob = dob; }
    public void setId(String id) { this.id = id; }

    public void addCourse(Course course) { courses.add(course); }
    public void addModule(Module module) { modules.add(module); }
}
