package Week4Practice.P01;

import java.util.Objects;
import java.util.Scanner;

public class WordTest {
    public static void main(String[] args) {
        // Input
        Scanner input = new Scanner(System.in);
        Word[] words = new Word[7];
        for (int i = 0; i < words.length; i++){
            String temp_word_en = input.next();
            String temp_word_kr = input.next();
            words[i] = new Word(temp_word_en, temp_word_kr);
        }
        // Solve,Output
        while(true){
            System.out.print("찾고자 하는 단어를 입력 하세요. 종료(f)>>\n");
            String find_word_en = input.next();
            if (Objects.equals(find_word_en, "f")){
                break;
            } else {
                for (Word word : words) {
                    if (Objects.equals(find_word_en, word.getWordEn())) {
                        System.out.print(word + "\n");
                    }
                }
            }
        }
        System.out.print("프로그램 종료");
        // Scanner close
        input.close();
    }
}
