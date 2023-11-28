package Final.Week14Practice.P06;

public class Student {
    private String name;
    private String phone_number;

    public Student(final String name, final String phone_number){
        this.name = name;
        this.phone_number = phone_number;
    }

    public String getName() {
        return name;
    }
    public String getPhone_number() {
        return phone_number;
    }

    @Override
    public String toString(){
        return ("Student [Name="+this.name+", Phone Number="+this.phone_number+"]");
    }
}
