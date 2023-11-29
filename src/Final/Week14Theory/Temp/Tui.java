package Final.Week14Theory.Temp;

import java.util.ArrayList;

public class Tui {
    private static String title;
    private static ArrayList<String> text;
    private static Integer size_max;
    static {
        Tui.reset();
    }
    public static void reset(){
        Tui.title = "";
        Tui.text = new ArrayList<>();
        Tui.size_max = 0;
    }

    public static void setTitle(final String title){
        Tui.title = title;
        if(Tui.size_max < title.length()){
            Tui.size_max = title.length();
        }
    }
    public static void addText(final String text){
        Tui.text.add(text);
        if(Tui.size_max < text.length()){
            Tui.size_max = text.length();
        }
    }
    public static void print(){
        if(!Tui.title.isEmpty() || !Tui.text.isEmpty()) {
            System.out.print("┏━");
            System.out.print(Tui.title);
            System.out.print("━".repeat(Tui.size_max - Tui.title.length()));
            System.out.print("━┓");
            System.out.print("\n");

            for (String line : text) {
                System.out.print("┃ ");
                System.out.print(line);
                System.out.print(" ".repeat(Tui.size_max - line.length()));
                System.out.print(" ┃");
                System.out.print("\n");
            }

            System.out.print("┗━");
            System.out.print("━".repeat(Tui.size_max));
            System.out.print("━┛");
            System.out.print("\n");

            Tui.reset();
        }
    }
}
