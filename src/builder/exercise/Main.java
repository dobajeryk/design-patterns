package builder.exercise;

public class Main {
    public static void main(String[] args) {
        FlightLeg leg1 = new FlightLeg.FlightLegBuilder("Las Vegas", "Los Angeles").buildPrice(50).build();
        System.out.println(leg1);

        FlightLeg leg2 = new FlightLeg.FlightLegBuilder("Las Vegas","Los Angeles").build();
        System.out.println(leg2);
    }
}
