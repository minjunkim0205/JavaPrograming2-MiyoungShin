package Mid.Week03Practice.P01;

public class ShoesTest {
    public static void main(String[] args) {
        Shoes sh = new Shoes(255, 3, "샌들");
        System.out.print(sh.toString() + "\n");
        System.out.print("샌들 한개를 팔았습니다\n");
        sh.sell(1);
        System.out.print("현재 샌들의 개수는 " + sh.getCnt() + " 입니다\n");
        System.out.print("샌들 두개를 추가합니다\n");
        sh.add(2);
        System.out.print("현재 샌들의 개수는 " + sh.getCnt() + " 입니다\n");
    }
}
