// Class to calculate the total travel time for the Tausi Coach from Kampala to Kabale
public class TausiCoachTravelTime {

    public static void main(String[] args) {
        // Define the total distance from Kampala to Kabale
        int totalDistance = 10000; // Distance in kilometers

        // Define the speed of the train
        int speed = 250; // Speed in kilometers per hour

        // Calculate the travel time without stops
        double travelTimeWithoutStops = (double) totalDistance / speed;

        // Retrieve the number of stops calculated in the previous part
        int passengerStopDistance = 150; // Distance in kilometers
        int refuelStopDistance = 200; // Distance in kilometers
        int passengerStops = totalDistance / passengerStopDistance;
        int refuelStops = totalDistance / refuelStopDistance;
        int commonStops = totalDistance / (passengerStopDistance * refuelStopDistance);
        int totalStops = passengerStops + refuelStops - commonStops;

        // Define the time spent at each stop
        int timePerStop = 5; // Time in minutes

        // Calculate the total time spent on stops
        int totalStopTime = totalStops * timePerStop; // Total stop time in minutes

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
