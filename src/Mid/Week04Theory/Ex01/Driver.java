package Mid.Week04Theory.Ex01;

public class Driver {
    /*public void drive(Vehicle vh){
        vh.run();
        if(vh instanceof Bus){
            ((Bus)vh).busType();
        }
    }*/
    public void drive(Vehicle vh){
        vh.run();
        if(vh instanceof Bus){
            Bus bus = (Bus)vh;
            bus.busType();
        }
    }
}
