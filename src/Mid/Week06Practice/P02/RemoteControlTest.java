package Mid.Week06Practice.P02;

public class RemoteControlTest {
    public static void main(String[] args) {
        // Tv
        RemoteControl tv = new Tv();
        tv.turnOn();
        System.out.print("---- TV볼륨을 10으로 합니다 ----\n");
        tv.setVolume(10);
        System.out.print("---- TV볼륨을 무음으로 합니다 ----\n");
        tv.setMute(true);
        // SmartPhone
        RemoteControl smart_phone = new SmartPhone();
        smart_phone.turnOn();
        System.out.print("---- SmartPhone볼륨을 50으로 합니다 ----\n");
        smart_phone.setVolume(50);
        RemoteControl.changeBattery();
    }
}
