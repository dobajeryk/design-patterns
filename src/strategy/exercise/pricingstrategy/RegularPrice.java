package strategy.exercise.pricingstrategy;

public class RegularPrice implements PricingStrategy {
    @Override
    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {
        if(!isSignedUpForNewsletter){
            System.out.println("Regular price: " + price + "zł");
        } else {
            System.out.println("User is signed to newsletter, please choose another price strategy!");
        }
    }
}
