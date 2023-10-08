package Week06Practice.P04;

public class PersonTest {
    public static String getMaximum(Person[] per){
        Person max = per[0];
        for (Person p : per){
            if(max.compareTo(p)==-1){
                max = p;
            }
        }
        return (max.toString());
    }

    public static void main(String[] args) {
        Person[] per = {
                new Person("Benny", 180),
                new Person("Daniel", 178),
                new Person("joon", 188)
        };
        System.out.println("------------ Person List ------------");

        for (Person p : per) {
            System.out.println(p);
        }
        System.out.println("가장 키 큰 : " + getMaximum(per));
    }
}
