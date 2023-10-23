package Mid.Week05Theory.Ex01.Qu01.Ex01;

public class InterfaceExam {
    public static void main(String[] args) {
        RemoteControl rc = new Radio();
        rc.turnOn();
        rc.setVolume(50);
        rc.turnOff();

        rc = new Television();
        rc.turnOn();
        rc.setVolume(70);
        rc.turnOff();
    }
}
