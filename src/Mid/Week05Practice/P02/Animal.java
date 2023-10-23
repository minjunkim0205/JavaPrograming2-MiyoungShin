package Mid.Week05Practice.P02;

abstract class Animal {
    private String type; // 유형
    public Animal(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }
    abstract void run();
    abstract void sound();
}