package Final.Week12Practice.P06;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Random;

public class Manage {
    public Manage(){
    }
    public void splitString(final String[] type, final String numbers){
        StringTokenizer string_tokenizer = new StringTokenizer(numbers, "-");
        final int size = string_tokenizer.countTokens();
        int i = 0;
        while(string_tokenizer.hasMoreTokens()){
            if(i < type.length){
                System.out.print(type[i]+" : ");
            }
            System.out.print(string_tokenizer.nextToken()+" ");
            i++;
            if(i < type.length){
                System.out.print("\n");
            }
        }
        System.out.print("\n");
    }
    public void startChar(){
        final int COUNT = 3;
        final int BEGIN = 'a';
        final int END = 'z';
        final int CAPITAL = 'a'-'A';

        Scanner input = new Scanner(System.in);
        Random random = new Random();
        for(int i = 0; i < COUNT; i++){
            char c = (char)(random.nextInt(END-BEGIN+1)+BEGIN);
            char C = (char)(c-CAPITAL);
            System.out.print(C+"로 시작하는 단어 >> ");
            while(true){
                String word = input.next();
                if(word.charAt(0)==c || word.charAt(0)==C){
                    break;
                }else {
                    System.out.print("다시 입력하세요 >> ");
                }
            }
        }
        input.close();
    }
    public int calChar(final String expression){
        String[] string_info = expression.split(" ");
        int result = Integer.parseInt(string_info[0]);

        for(int i = 1; i < string_info.length; i+=2){
            String opertor = string_info[i];
            int value = Integer.parseInt(string_info[i+1]);
            switch (opertor){
                case "+":
                    result += value;
                    break;
                case "-":
                    result -= value;
                    break;
                case "*":
                    result *= value;
                    break;
                default:
                    break;
            }
        }
        return (result);
    }
}
