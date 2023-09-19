package Week4Practice;

import java.util.Scanner;

public class Control extends CodeTest{
    /*Private*/
    /*Static*/
    static void creation(CodeTest[] code, Scanner key){
        for (int i = 0; i < code.length; i++){
            code[i] = new CodeTest(key.next(), (int)((Math.random()*90)+10));
            // code[i] = new CodeTest(key.next(), key.nextInt());
        }
    }
    static void write(CodeTest[] code){
        for (int i = 0; i < code.length; i++){
            System.out.print(code[i].toString());
        }
    }
    static void sort(CodeTest[] code){
        for (int p = 1; p < code.length; p++){
            for (int j = 0; j < code.length-p; j++){
                if (code[j].getNumber() > code[j+1].getNumber()){
                    CodeTest temp = code[j];
                    code[j] = code[j+1];
                    code[j+1] = temp;
                }
            }
        }
    }
    /*Constructor*/
    Control(final String name, final int number){
        super(name, number);
    }
    /*Public*/
    /*ToString*/
}
