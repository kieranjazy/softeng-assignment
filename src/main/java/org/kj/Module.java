package org.kj;

import java.util.List;

public class Module {
    private String name;
    private String id;
    private List<Student> students;
    private List<Course> courses;
    private Lecturer supervisor;

    public Module(String name, String id, List<Student> students, List<Course> courses, Lecturer supervisor) {
        this.name = name;
        this.id = id;
        this.students = students;
        this.courses = courses;
        this.supervisor = supervisor;
    }

    //Getters

    public String getName() { return name; }
    public String getId() { return id; }
    public List<Student> getStudents() { return students; }
    public List<Course> getCourses() { return courses; }
    public Lecturer getSupervisor() { return supervisor; }

    //Setters

    public void setName(String name) { this.name = name; }
    public void setId(String id) { this.id = name; }

    public void addStudent(Student student) {
        students.add(student);
        student.addModule(this);
    }

    public void addCourses(Course course) {
        courses.add(course);
        course.addModules(this);
    }

    public void setSupervisor(Lecturer supervisor) { this.supervisor = supervisor; }

}
