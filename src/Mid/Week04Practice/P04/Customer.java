package Mid.Week04Practice.P04;

public class Customer extends Person {
    /*Private*/
    private String number;
    private int mileage;
    /*Static*/
    /*Constructor*/
    Customer(final String name, final String address, final String phone, final String number, final int mileage) {
        // 이름, 주소, 전화번호, 고객번호, 마일리지
        super(name, address, phone);
        this.number = number;
        this.mileage = mileage;
    }
    Customer(final String name, final String address, final String number, final int mileage) {
        // 이름, 주소, 고객번호, 마일리지
        super(name, address);
        this.mileage = mileage;
        this.number = number;
    }
    /*Public*/
    public void setNumber(final String number) {
        this.number = number;
    }
    public void setMileage(final int mileage) {
        this.mileage = mileage;
    }
    public String getNumber() {
        return this.number;
    }
    public int setMileage() {
        return this.mileage;
    }
    /*ToString*/
    public String toString() {
        return (super.toString()+"Number="+this.number+", Mileage="+this.mileage+"\n");
    }
}
