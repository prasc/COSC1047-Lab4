public class Main {

    public static void main(String[] args) {
        Car carOne = new Car("Honda", 10);
        Car carTwo = new Car("Ford",15);

        System.out.println("Are they the same model? " + carOne.equals(carTwo));

        System.out.print("Which car is faster? ");

        if (carOne.compareTo(carTwo) == 1) {
            System.out.println(carOne.getModel());
        } else if ((carOne.compareTo(carTwo) == -1)) {
            System.out.println(carTwo.getModel());
        } else {
            System.out.println("Both cars are the same speed at: " + carOne.getSpeed() + "km/h");
        }
    }
}
