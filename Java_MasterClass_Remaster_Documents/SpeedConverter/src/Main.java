public class Main {

    public static void main(String[] args) {

        // Example of a local variable because it is declared in the method body
        long miles = SpeedConverter.toMilesPerHour(10.5);

        System.out.println("Miles = " + miles);

        SpeedConverter.printConversion(10.5);

    }
}


