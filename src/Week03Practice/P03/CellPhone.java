package Week03Practice.P03;

public class CellPhone {
    /*Private*/
    private String telNum;
    private boolean power;
    /*Constructor*/
    public CellPhone(){
        this.telNum = "000-0000-0000";
        this.power = true;
    }
    public CellPhone(String tellNum){
        this.telNum = tellNum;
        this.power = true;
    }
    /*Public*/
    public void powerToggle(){
        power = !power;
    }
    /*ToString*/
    public String toString(){
        return ("폰번호: "+this.telNum+", 전원상태: "+this.power);
    }
}
