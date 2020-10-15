public class Car extends Vehicle implements  Drivable {
    private String model;
    private int speed;

    public Car () {
        this("unknown", 0);
    }

    public Car (String model) {
        this(model, 0);
    }

    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }

    public boolean equals(Car car) {
        if (getModel() == car.getModel())
            return true;
        else
            return false;
    }

    public int compareTo(Car car) {
        if (getSpeed() > car.getSpeed())
            return 1;
        else if (getSpeed() < car.getSpeed())
            return -1;
        else
            return 0;
    }

    @Override
    public String howToDrive() {
        return "Step on gas pedal";
    }

    @Override
    public void steer() {
        System.out.println("Turn steering wheel");
    }

}
