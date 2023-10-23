package Mid.Week03Practice.P04;

public class Student {
    /*Private*/
    private String name;
    private double score;
    private String grade;

    private String scoreToGrade(){
        if (this.score >= 95){
            return "A+";
        } else if (this.score >= 90) {
            return "A";
        } else if (this.score >= 85) {
            return "B+";
        } else if (this.score >= 80) {
            return "B";
        } else if (this.score >= 75) {
            return "C+";
        } else if (this.score >= 70) {
            return "C";
        } else if (this.score >= 65) {
            return "D+";
        } else if (this.score >= 60) {
            return "D";
        } else if (this.score >= 55) {
            return "E+";
        } else if (this.score >= 50) {
            return "E";
        } else {
            return "F";
        }
    }
    /*Static*/
    /*Constructor*/
    public Student(String name, double score){
        this.name = name;
        this.score = score;
        this.grade = scoreToGrade();
    }
    public Student(){
        this.name = "anonymous";
        this.score = 0;
        this.grade = scoreToGrade();
    }
    /*Public*/
    public void setter(String name, double score){
        this.name = name;
        this.score = score;
        this.grade = scoreToGrade();
    }
    public void setScore(double score){
        this.score = score;
        this.grade = scoreToGrade();
    }
    /*ToString*/
    public String toString(){
        return ("Student [이름="+this.name+", 성적="+this.score+", 등급="+this.grade+"]");
    }
}
