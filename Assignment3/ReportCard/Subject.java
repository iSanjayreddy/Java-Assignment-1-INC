package Assignment3;

public class Subject {
    private String SubjectName;
    private int Marks;
    private String Judgement;
    
    public Subject(String SubjectName, int Marks, String Judgement) {
        this.SubjectName = SubjectName;
        this.Marks = Marks;
        this.Judgement = Judgement;
    }

    public String getSubjectName() {
        return SubjectName;
    }
    
    public int getMarks() {
        return Marks;
    }
    
    public String getJudgement() {
        return Judgement;
    }
}
