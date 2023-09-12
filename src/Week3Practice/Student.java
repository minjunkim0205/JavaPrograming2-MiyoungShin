package Week3Practice;

public class Student {
    /*Private*/
    private String name;
    private double score;
    private String grade;
    /*Static*/
    /*Constructor*/
    public Student(String name, double score, String grade){
        this.name = name;
        this.score = score;
        this.grade = grade;
    }
    public Student(){
        this.name = "anonymous";
        this.score = 0;
        this.grade = "F";
    }
    /*Public*/
    public void setter(String name, double score, String grade){
        this.name = name;
        this.score = score;
        this.grade = grade;
    }
    public void setScore(double score, String grade){
        this.score = score;
        this.grade = grade;
    }
    /*ToString*/
    public String toString(){
        return ("Student [이름="+this.name+", 성적="+this.score+", 등급="+this.grade+"]");
    }
}
