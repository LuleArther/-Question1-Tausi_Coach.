// Class to calculate the number of stops for a Tausi Coach from Kampala to Kabale
public class TausiCoach {

    public static void main(String[] args) {
        // Define the total distance from Kampala to Kabale
        int totalDistance = 10000; // Distance in kilometers

        // Define the distance after which the coach must stop for passengers
        int passengerStopDistance = 150; // Distance in kilometers

        // Define the distance after which the coach must stop for refueling
        int refuelStopDistance = 200; // Distance in kilometers

        // Calculate the number of passenger stops
        int passengerStops = totalDistance / passengerStopDistance;

        // Calculate the number of refueling stops
        int refuelStops = totalDistance / refuelStopDistance;

        // Calculate the total number of unique stops
        int totalStops = passengerStops + refuelStops;

        // Since the coach cannot stop twice at the same point, we subtract the common stops
        int commonStops = totalDistance / (passengerStopDistance * refuelStopDistance);

        // Final total stops considering the common stops
        totalStops -= commonStops;

        // Output the results
        System.out.println("Total stops for passengers: " + passengerStops);
        System.out.println("Total stops for refueling: " + refuelStops);
        System.out.println("Total number of unique stops: " + totalStops);
    }
}
