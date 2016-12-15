import java.util.ArrayList;

/**
 * Created by javan on 12/13/2016.
 */
public class Player {
    int cash;
    int respect;
    ArrayList<Car> cars;

    public Player(int cash, int respect, Car first_car) {
        this.cash = cash;
        this.respect = respect;
        this.cars.add(first_car) ;
    }

    public int getCash() {
        return cash;
    }

    public int getRespect() {
        return respect;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public void setRespect(int respect) {
        this.respect = respect;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    //it cuold be a gadget class for collecting  extra engins , wheels , brakes player buy
}
