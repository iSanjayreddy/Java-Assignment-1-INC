package Assignment3;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ReportCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student's first name:");
        String Name = sc.nextLine();
        System.out.println("Enter student's surname:");
        String Surname = sc.nextLine();
        System.out.println("Enter student's class name:");
        String StudentClass = sc.nextLine();
        
        System.out.println("Enter the number of subjects for the student:");
        int NoOfSubjects = sc.nextInt();
        
        sc.nextLine();  // Consume the leftover newline character from nextInt()

        List<Subject> subjects = new ArrayList<>();
        for (int i = 0; i < NoOfSubjects; i++) {
            System.out.print("Enter subject name: ");
            String SubjectName = sc.nextLine();
            
            System.out.print("Enter marks for " + SubjectName + ": ");
            int marks = Integer.parseInt(sc.nextLine());
            
            System.out.print("Enter remarks for " + SubjectName + ": ");
            String remark = sc.nextLine();
            
            // Creating a new Subject and adding it to the list 
            Subject subject = new Subject(SubjectName, marks, remark);
            subjects.add(subject);
        }
        
        Student student = new Student(Name, Surname, StudentClass, subjects);
        
        // Print the report card in a readable format
        System.out.println("\n*** Student Report Card ***");
        System.out.println("Name: " + student.getName() + " "+ student.getSurname());
        System.out.println("Class: " + student.getStudentClass());
        System.out.println("Subject   Marks   Remarks");
        for (Subject subject : student.getSubjects()) {
            System.out.println(subject.getSubjectName() + "\t" + subject.getMarks() + "\t" + subject.getJudgement());
        }

        // Save the data to CSV
        List<Student> students = new ArrayList<>();
        students.add(student);
        sc.close();
        ReportCardPrinter printer = new ReportCardPrinter();
        printer.PrintTOCSV(students, "report_cards.csv");
    }
}

