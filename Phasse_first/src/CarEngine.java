import src.CarDevice;

/**
 * Created by faezeh labbaf on 12/12/2016.
 * includes acceleration and max speed
 */
public class CarEngine implements CarDevice {
    private boolean isLocked;
    private float acceleration;
    private float maxSpeed;
    private int health;
    int price;

    public CarEngine(float speed, float acceleration , int price) {
        this.maxSpeed = speed;
        this.acceleration = acceleration;
        this.health = 100;
        this.price = price;
    }
    /**
     * engine health decrease after each competition
     * @param h amount of decreasing heath
     */
    @Override
    public void decHealth(int h){
        this.health-= h;
    }
    /**
     * you could increase the health in Garage
     * @param h amount of increasing health
     *
     */
    @Override
    public void incHealth(int h ){
        this.health+= h;
    }

    public float getAcceleration() {
        return acceleration;
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setMaxSpeed(float maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setAcceleration(float acceleration) {
        this.acceleration = acceleration;
    }

    public void setIsLocked(boolean locked) {
        isLocked = locked;
    }

    public boolean getIsLocked() {
        return isLocked;
    }
}
