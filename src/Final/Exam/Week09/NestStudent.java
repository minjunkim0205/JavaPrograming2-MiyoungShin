package Final.Exam.Week09;

import java.util.Scanner;

public class NestStudent {
    private String name;
    private Subject subject;

    public NestStudent(final String name, final int cnt){
        this.name = name;
        subject = new Subject(cnt);
    }

    public void stdPrint(){
        System.out.print(this.name+"\n");
        this.subject.subjectPrint();
    }

    static class Subject{
        private String[] subjects;

        public Subject(final int size){
            Scanner input = new Scanner(System.in);
            this.subjects = new String[size];
            for(int i = 0; i < size; i++){
                this.subjects[i] = input.next();
            }
            input.close();
        }

        public void subjectPrint(){
            for (String element : this.subjects){
                System.out.print(element+"\n");
            }
        }
    }
}
