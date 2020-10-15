public abstract class Vehicle {
    private String color;
    private java.util.Date dateMade;

    public Vehicle() {
        this("White");
        this.dateMade = new java.util.Date();
    }

    public Vehicle(String color) {
        this.color = color;
        this.dateMade = new java.util.Date();
    }

    public java.util.Date getDateMade() {
        return this.dateMade;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public abstract void steer();


}
