package Mid.Week06Theory.Ex02;

public class AnonymousClassTest {
    public static void main(String[] args) {
        RemoteControl ac = new RemoteControl() {
            int volume;
            public void turnOn() {
                System.out.print("TV on\n");
            }
            public void turnOff() {
                System.out.print("TV off\n");
            }
            public void setVolume(final int volume) {
                this.volume = volume;
                System.out.print("cur volume : "+this.volume+"\n");
            }
        };
        ac.turnOn();
        ac.setVolume(5);
        ac.turnOff();
        ac.setVolume(10);
    }
}
