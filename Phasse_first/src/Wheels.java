/**
 * Created by javan on 12/12/2016.
 */
public class Wheels {
    boolean isLocked;
    float health;
    float friction;
    float nmf;

    public Wheels(float health, float friction, float nmf) {
        this.health = health;
        this.friction = friction;
        this.nmf = nmf;
    }

    public float getHealth() {
        return health;
    }

    public float getFriction() {
        return friction;
    }

    public float getNmf() {
        return nmf;
    }

    public void setHealth(float health) {
        this.health = health;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public boolean isLocked() {
        return isLocked;
    }
}
