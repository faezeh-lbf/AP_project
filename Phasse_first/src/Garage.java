import src.CarDevice;

/**
 * Created by javan on 12/15/2016.
 */
public class Garage {
    int repairCash = 5;
    void repair(CarDevice device , Player player ){
        device.incHealth(10);
        player.setCash(player.getCash()- repairCash);
        if(player.getCash()<0){
            device.decHealth(10);
            player.setCash(player.getCash()+ repairCash);
            //an exeption
        }
    }

    void repairCar(Car car , Player player){
        car.healthRAte+=10;
        player.setCash(player.getCash() - car.getFixPrice());
        if(player.getCash()<0){
            car.healthRAte-=10;
            player.setCash(player.getCash() + car.getFixPrice());
            //not enough money exception
        }
    }

    void fullCar(Car car , Player player){
        player.setCash(player.getCash() - 7*car.getFixPrice());
        if(player.getCash()<0){
            player.setCash(player.getCash() + 7*car.getFixPrice());
            //not enough money exception
        }
        else car.setHealthRAte(100);
    }

    void fullDevice(CarDevice device , Player player){
        player.setCash(player.getCash() - 7*repairCash);
        if(player.getCash()<0){
            player.setCash(player.getCash() + 7*repairCash);
            //not enough money exception
        }
        else device.setHealth(100);
    }
    
}
