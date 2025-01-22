package Assignment3;

import java.util.List;

public class Student {
    private String StudentClass;
    private String Name;
    private String Surname;
    private List<Subject> Subjects;
    
    public Student(String Name, String Surname, String StudentClass, List<Subject> Subjects) {
        this.Name = Name;
        this.Surname = Surname;
        this.StudentClass = StudentClass;
        this.Subjects = Subjects;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public String getStudentClass() {
        return StudentClass;
    }

    public List<Subject> getSubjects() {
        return Subjects;
    }
}
