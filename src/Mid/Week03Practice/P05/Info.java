package Mid.Week03Practice.P05;

public class Info {
    /*Private*/
    private String id;
    private int pass;
    /*Static*/
    /*Constructor*/
    public Info(String id){
        this.id = id;
        this.pass = (int)(Math.random()*9000)+1000;
    }
    /*Public*/
    public void resetPassword(){
        this.pass = (int)(Math.random()*9000)+1000;
    }
    public void setter(String id, int pass){
        this.id = id;
        this.pass = pass;
    }
    public String getter(){
        return ("Info [아이디="+this.id+", 비밀번호="+this.pass+"]");
    }
    /*ToString*/
    public String toString(){
        return ("Info [아이디="+this.id+", 비밀번호="+this.pass+"]");
    }
}
