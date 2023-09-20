package Week4Practice.P04;

public class Person {
    /*Private*/
    private String name;
    private String address;
    private String phone;
    /*Static*/
    /*Constructor*/
    Person(final String name, final String address, final String phone){
        // 이름, 주소, 전화번호
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
    Person(final String name, final String address){
        // 이름, 주소
        this.name = name;
        this.address = address;
    }
    /*Public*/
    public void setName(final String name){
        this.name = name;
    }
    public void setAddress(final String address){
        this.address = address;
    }
    public void setPhone(final String phone){
        this.phone = phone;
    }
    public String getName(){
        return this.name;
    }
    public String getAddress(){
        return this.address;
    }
    public String getPhone(){
        return this.phone;
    }
    /*ToString*/
    public String toString() {
        return ("name="+this.name+", address="+this.address+", phone="+this.phone+"\n");
    }
}
