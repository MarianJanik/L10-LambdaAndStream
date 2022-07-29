package cz.marianjanik.ekurz;

public class Car {
    private String name;
    private String type;
    private int distanceTraveled;
    private int maximalSpeed;

    public Car(String name, String type, int distanceTraveled, int maximalSpeed) {
        this.name = name;
        this.type = type;
        this.distanceTraveled = distanceTraveled;
        this.maximalSpeed = maximalSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(int distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    public int getMaximalSpeed() {
        return maximalSpeed;
    }

    public void setMaximalSpeed(int maximalSpeed) {
        this.maximalSpeed = maximalSpeed;
    }
}
