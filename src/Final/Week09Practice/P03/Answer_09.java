package Final.Week09Practice.P03;

public class Answer_09 {
    public static void main(String[] args) {
        Func1 sum = (a, b) -> a+b;
        Func1 minus = (a, b) -> a - b;
        Func1 multiply = (a, b) -> a*b;
        Func1 exponent = (a, b) -> {
            int result = 1;
            for (int i = 0; i < b; i++){
                result *= a;
            }
            return result;
        };
        int x = ((int)(Math.random()*10)+1);
        int y = ((int)(Math.random()*10)+1);
        System.out.print("result>>"+x+"+"+y+"="+sum.calc(x, y)+"\n");
        x = ((int)(Math.random()*10)+1);
        y = ((int)(Math.random()*10)+1);
        System.out.print("result>>"+x+"-"+y+"="+minus.calc(x, y)+"\n");
        x = ((int)(Math.random()*10)+1);
        y = ((int)(Math.random()*10)+1);
        System.out.print("result>>"+x+"*"+y+"="+multiply.calc(x, y)+"\n");
        x = ((int)(Math.random()*10)+1);
        y = ((int)(Math.random()*10)+1);
        System.out.print("result>>"+x+"**"+y+"="+exponent.calc(x, y)+"\n");
    }
}
