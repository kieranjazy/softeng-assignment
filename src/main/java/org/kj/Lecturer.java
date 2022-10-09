package org.kj;

import org.joda.time.DateTime;
import org.joda.time.Years;

import java.util.ArrayList;
import java.util.List;

public class Lecturer {
    private String fName;
    private String lName;
    private DateTime dob;
    private String id;
    private List<Module> modules;

    public Lecturer(String fName, String lName, DateTime dob, String id) {
        this.fName = fName;
        this.lName = lName;
        this.dob = dob;
        this.id = id;
        this.modules = new ArrayList<Module>();
    }

    //Getters

    public String getFirstName() { return fName; }
    public String getLastName() { return lName; }
    public String getFullName() { return fName + ' ' + lName; }

    public DateTime getDob() { return dob; }
    public int getAge() { return Math.abs(Years.yearsBetween(DateTime.now(), dob).getYears()); }
    public String getId() { return id; }
    public String getUsername() { return fName + lName + getAge(); }
    public List<Module> getModules() { return modules; }

    //Setters

    public void setFirstName(String fName) { this.fName = fName; }
    public void setLastName(String lName) { this.lName = lName; }

    public void setDob(DateTime dob) { this.dob = dob; }
    public void setId(String id) { this.id = id; }

    public void addModule(Module module) { modules.add(module); }
}
