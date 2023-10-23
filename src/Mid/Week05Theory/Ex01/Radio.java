package Mid.Week05Theory.Ex01;

public class Radio implements RemoteControl{
    /*Private*/
    private int volume;
    /*Static*/
    /*Constructor*/
    /*Abstract*/
    public void turnOn(){
        System.out.print("Radio를 켭니다\n");
    }
    public void turnOff(){
        System.out.print("Radio를 끕니다\n");
    }
    public void setVolume(final int volume){
        this.volume = volume;
        System.out.print("Radio의 volume은 "+this.volume+"% 입니다\n");
    }
    /*Public*/
    /*ToString*/
}
