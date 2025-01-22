package Assignment3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ReportCardPrinter {
    
    public void PrintTOCSV(List<Student> students, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write("Name,Surname,Subject,Marks,Judgement\n");
            
            for (Student student : students) {
                for (Subject subject : student.getSubjects()) {
                    writer.write(student.getName() + "," + student.getSurname() + ","
                            + subject.getSubjectName() + "," + subject.getMarks() + ","
                            + subject.getJudgement() + "\n");
                }
            }
            System.out.println("The data is written to CSV file " + filename);
        } catch (IOException e) {
            System.out.println("Error while writing into the CSV file: " + e.getMessage());
        }
    }
}
