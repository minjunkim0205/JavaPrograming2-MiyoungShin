package Final.Week09Practice.P05;

import java.util.Scanner;
//중첩 클래스
public class NestStudent {
    /*Field*/
    private String name;
    private Subject subject;
    /*Constructor*/
    public NestStudent(String name, int cnt) {
        this.name = name;
        System.out.print(this.name+"==>\n");
        this.subject = new Subject(cnt);
    }
    /*Method*/
    public void stdPrint() {
        System.out.print("====================================\n");
        System.out.print(this.name+"의 수강과목\n");
        this.subject.subjectprint();
    }
    /*Class*/
     public static class Subject {
        private String[] subjects_list;
        Subject(int num) {
            Scanner input = new Scanner(System.in);
            this.subjects_list = new String[num];
            for(int i = 0; i < num; i++){
                System.out.print("수강 과목("+(1+i)+"):");
                this.subjects_list[i] = input.next();
            }
        }
        public void subjectprint() {
            for(String sub:this.subjects_list){
                System.out.print(sub+"\n");
            }
        }
    }
    /*ToString*/
}
