package day2.OOP.Student;

public class Student {
    public String name ;
    public int score;
    private Boolean isPass;

    public Student(String studentName, int sudentScore){
        name = studentName;
        score = sudentScore;
        isPass = false;
    }

    public void cekStatus(){
        if(score >= 85){
            isPass = true;
            System.out.println("name : " + name + ", Score : " + score + ", isPass : " + isPass);
            System.out.println("Status : lulus");
        }else {
            System.out.println("name : " + name + ", Score : " + score + ", isPass : " + isPass);
            System.out.println("Status : tidak lulus");
        }
    }
}
