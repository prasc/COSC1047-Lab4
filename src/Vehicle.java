public abstract class Vehicle {
    private String color;
    private java.util.Date manufacturedDate;

    public Vehicle() {
        this("White");
        this.manufacturedDate = new java.util.Date();
    }

    public Vehicle(String color) {
        this.color = color;
        this.manufacturedDate = new java.util.Date();
    }

    public java.util.Date getManufacturedDate() {
        return this.manufacturedDate;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public abstract void steer();


}
