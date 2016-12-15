import java.awt.Color;

/**
 * Created by javan on 12/12/2016.
 */
public class Car {
    boolean isLocked;
    Color color;
    int power;
    float len;
    float width;
    CarEngine engine;
    Wheels wheels;
    Brake aBrake;
    int price;
    int fixPrice;
    int healthRAte;

    public Car(float width, float len, int fixPrice, int price) {
        this.width = width;
        this.len = len;
        this.fixPrice = fixPrice;
        this.price = price;
    }


    /**
     * brake health decreases in every accident
     * @param h amount of decreasing heath
     */
    public void decHealth(int h){
        this.healthRAte-= h;
    }

    /**
     * you could increase the health in Garage
     * @author faezeh labbaf
     * @param h amount of increasing health
     */
    public void incHealth(int h ){
        this.healthRAte+= h;
    }
    public Color getColor() {
        return color;
    }

    public int getPower() {
        return power;
    }

    public float getLen() {
        return len;
    }

    public float getWidth() {
        return width;
    }

    public CarEngine getEngine() {
        return engine;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public Brake getaBrake() {
        return aBrake;
    }

    public int getPrice() {
        return price;
    }

    public int getFixPrice() {
        return fixPrice;
    }

    public float getHealthRAte() {
        return healthRAte;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setEngine(CarEngine engine) {
        this.engine = engine;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    public void setaBrake(Brake aBrake) {
        this.aBrake = aBrake;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setHealthRAte(int  healthRAte) {
        this.healthRAte = healthRAte;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public boolean isLocked() {
        return isLocked;
    }
}
