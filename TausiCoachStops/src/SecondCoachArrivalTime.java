import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

// Class to calculate the approximate arrival time of the second coach from Kabale to Kampala
public class SecondCoachArrivalTime {

    public static void main(String[] args) {
        // Define the total distance from Kabale to Kampala
        int totalDistanceKm = 10000; // Distance in kilometers

        // Convert total distance to meters
        int totalDistanceMeters = totalDistanceKm * 1000; // Distance in meters

        // Define the speed of the second coach in meters per second
        double speedMetersPerSecond = 225.5;

        // Calculate the travel time in seconds
        double travelTimeInSeconds = totalDistanceMeters / speedMetersPerSecond;

        // Convert the travel time from seconds to hours
        double travelTimeInHours = travelTimeInSeconds / 3600;

        // Define the start time of the journey
        LocalTime startTime = LocalTime.of(9, 0); // Start time at 09:00 hrs

        // Calculate the arrival time by adding travel time to start time
        LocalTime arrivalTime = startTime.plusSeconds((long) travelTimeInSeconds);

        // Format the arrival time for output
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        // Output the results
        System.out.println("Travel time: " + travelTimeInHours + " hours");
        System.out.println("Arrival time in Kampala: " + arrivalTime.format(timeFormatter));
    }
}
