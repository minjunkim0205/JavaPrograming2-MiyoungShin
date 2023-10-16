package MidtermExam.Te03;

public class Test {
    public static void main(String[] args) {
        Control control = new Control(3);
        System.out.print("--------------------------------------\n");
        control.input();
        System.out.print("--------------------------------------\n");
        //control.write("Univ");
        System.out.print("--------------------------------------\n");
        //control.write("Comp");
        System.out.print("--------------------------------------\n");
        System.out.print(control.search("python", "3457"));
        System.out.print("--------------------------------------\n");
    }
}
