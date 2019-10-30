public class SpeedConverter {

    // 1) Write a method called ** toMilesPerHour ** that has ** 1 parameter ** of ** type double **
    // with the name kilometersPerHour. This method needs to return the rounded value
    // of the calculation of type ** long **.
    // If the parameter kilometersPerHour is less than 0, the method toMilesPerHour needs to return
    // -1 to indicate value.
    // Otherwise, if it is positive, calculate the value of miles per hour, round it and return it.

    public static long toMilesPerHour(double kilometersPerHour) {

        if(kilometersPerHour < 0) {
            return -1;
        }

        return Math.round(kilometersPerHour / 1.609);

    }

    // ** Instructions **
    // -- Write another method called ** printConversion ** and ** 1 parameter ** of ** type double **
    // -- with the name ** kilometersPerHour **.
    // -- This method should ** not return anything (void) ** and it needs to ** calculate milesPerHour ** from the
    // -- ** kilometersPerHour ** parameter.
    // -- Then it needs to print a message in the form ""

    public static void printConversion (double kilometersPerHour) {

        // Conditional Statement
        if(kilometersPerHour < 0 ) {
            System.out.println("Invalid Value");
        } else {
            // Create a new variable and assign it to ** toMilesPerHour ** method
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }


}
