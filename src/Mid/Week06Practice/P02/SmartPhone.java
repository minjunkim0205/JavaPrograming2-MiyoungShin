package Mid.Week06Practice.P02;

public class SmartPhone implements RemoteControl {
    /*Private*/
    private int volume;
    /*Static*/
    /*Constructor*/
    /*Abstract*/
    public void turnOn() {
        System.out.print("SmartPhone을 켭니다.\n");
    }
    public void turnOff() {
        System.out.print("SmartPhone을 끕니다.\n");
    }
    public void setVolume(final int volume) {
        if(volume > RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.print("현재 SmartPhone 볼륨: "+this.volume+"\n");
    }
    /*Public*/
    /*ToString*/
}