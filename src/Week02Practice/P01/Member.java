package Week02Practice.P01;

public class Member {
    // Private
    /*
    private String name;
    private String id;
    private String password;
    private Integer age;
    */
    // Public
    public String name;
    public String id;
    public String password;
    public Integer age;

    public Member(){

    }
    public Member(String name, String id, String password, Integer age) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.age = age;
    }
    /*
    public String toString(){
        return "name="+this.name+"\nid="+this.id+"\npassward="+this.password+"\nage="+this.age;
    }
    */
}
