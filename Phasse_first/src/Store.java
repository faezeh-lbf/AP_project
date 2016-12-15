/**
 * Created by javan on 12/13/2016.
 */
public class Store {
    Car[] cars;
    CarEngine[] carEngines;
    Wheels[] wheels;
    Brake[] brakes; // be carefull break is keyword

    public Store() {
        this.brakes = new Brake[10];
        this.carEngines = new CarEngine[10];
        this.cars = new Car[15];
        this.wheels = new Wheels[10];
    }
}
