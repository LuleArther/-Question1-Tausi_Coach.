// Class to calculate the total travel time for the Tausi Coach on its return journey from Kabale to Kampala
public class TausiCoachReturnJourney {

    public static void main(String[] args) {
        // Define the total distance from Kabale to Kampala
        int totalDistance = 10000; // Distance in kilometers

        // Define the speed of the train
        int speed = 250; // Speed in kilometers per hour

        // Calculate the travel time without stops
        double travelTimeWithoutStops = (double) totalDistance / speed;

        // Define the distance after which the coach must stop for refueling
        int refuelStopDistance = 200; // Distance in kilometers

        // Calculate the number of refueling stops
        int refuelStops = totalDistance / refuelStopDistance;

        // Define the time spent at each stop
        int timePerStop = 5; // Time in minutes

        // Calculate the total time spent on stops
        int totalStopTime = refuelStops * timePerStop; // Total stop time in minutes

        // Convert stop time to hours
        double totalStopTimeInHours = (double) totalStopTime / 60;

        // Calculate the total travel time including stops
        double totalTravelTime = travelTimeWithoutStops + totalStopTimeInHours;

        // Output the results
        System.out.println("Travel time without stops: " + travelTimeWithoutStops + " hours");
        System.out.println("Total stop time: " + totalStopTime + " minutes");
        System.out.println("Total travel time including stops: " + totalTravelTime + " hours");
    }
}
