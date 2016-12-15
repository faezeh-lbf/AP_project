/**
 * Created by javan on 12/12/2016.
 */
public class Brake {
    private boolean isLocked;
    private float acselertion;
    private int price;
    int health;

    public Brake(float acselertion, int price) {
        this.acselertion = acselertion;
        this.price = price;
        this.health = 100;
    }

    /**
     * brake health decrease after each competition
     * @param h amount of decreasing heath
     */
    public void decHealth(int h){
        this.health-= h;
    }

    /**
     * you could increase the health in Garage
     * @author faezeh labbaf
     * @param h amount of increasing health
     */
    public void incHealth(int h ){
        this.health+= h;
    }

    public float getAcselertion() {
        return acselertion;
    }

    public int getPrice() {
        return price;
    }

    public void setAcselertion(float acselertion) {
        this.acselertion = acselertion;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public boolean isLocked() {
        return isLocked;
    }
}

