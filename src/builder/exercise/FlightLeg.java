package builder.exercise;

public class FlightLeg {
    private String from;
    private String to;
    private boolean delayed;
    private double price;

    private FlightLeg(FlightLegBuilder flightLegBuilder) {
        this.from = flightLegBuilder.from;
        this.to = flightLegBuilder.to;
        this.delayed = flightLegBuilder.delayed;
        this.price = flightLegBuilder.price;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public boolean isDelayed() {
        return delayed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "FlightLeg{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", delayed=" + delayed +
                ", price=" + price +
                '}';
    }

    static class FlightLegBuilder {
        private String from;
        private String to;
        private boolean delayed;
        private double price;

        public FlightLegBuilder(String from, String to) {
            this.from = from;
            this.to = to;
            this.delayed = false;
        }

        public FlightLegBuilder buildPrice(int price) {
            this.price = price;
            return this;
        }

        public FlightLeg build() {
            if(this.price==0) {
                throw new IllegalStateException("Brak wymaganego pola - cena");
            }
            return new FlightLeg(this);
        }
    }

}
