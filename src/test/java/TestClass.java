import org.kj.Course;
import org.kj.Lecturer;
import org.kj.Module;
import org.kj.Student;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

public class TestClass {

    @Test
    public void testUsernames() {
        Student testStudent = new Student("John", "Smith", "2001-01-01", "1");
        assertEquals(testStudent.getAge(), 21);
        assertEquals(testStudent.getUsername(), testStudent.getFirstName() + testStudent.getLastName() + testStudent.getAge());

        Lecturer testLecturer = new Lecturer("Jenny", "Smith", "1981-01-01", "1");
        assertEquals(testLecturer.getAge(), 41);
        assertEquals(testLecturer.getUsername(), testLecturer.getFirstName() + testLecturer.getLastName() + testLecturer.getAge());
    }

    @Test
    public void testAddStudentToCourse() {
        Student testStudent = new Student("John", "Smith", "2001-01-01", "1");
        Course testCourse = new Course("IT", "2022-09-01", "2022-12-20");

        assertArrayEquals(testStudent.getCourses().toArray(), new Course[]{});
        assertArrayEquals(testCourse.getStudents().toArray(), new Student[]{});

        testCourse.addStudent(testStudent);

        assertArrayEquals(testStudent.getCourses().toArray(), new Course[]{testCourse});
        assertArrayEquals(testCourse.getStudents().toArray(), new Student[]{testStudent});
    }

    @Test
    public void testAddLecturerToModule() {
        Lecturer testLecturer = new Lecturer("Jenny", "Smith", "1981-01-01", "1");
        assertArrayEquals(testLecturer.getModules().toArray(), new Module[]{});

        Module testModule = new Module("Programming", "1", testLecturer);
        assertEquals(testModule.getSupervisor(), testLecturer);
        assertArrayEquals(testLecturer.getModules().toArray(), new Module[]{testModule});
    }

    @Test
    public void testAddStudentToCourseAndModule() {
        Student testStudent = new Student("John", "Smith", "2001-01-01", "1");
        Lecturer testLecturer = new Lecturer("Jenny", "Smith", "1981-01-01", "1");
        Course testCourse = new Course("IT", "2022-09-01", "2022-12-20");
        Module testModule = new Module("Programming", "1", testLecturer);

        testCourse.addModule(testModule);
        testCourse.addStudent(testStudent);
        assertArrayEquals(testStudent.getModules().toArray(), new Module[]{testModule});
    }

}
