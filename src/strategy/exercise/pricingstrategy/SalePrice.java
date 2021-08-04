package strategy.exercise.pricingstrategy;

public class SalePrice implements PricingStrategy {
    @Override
    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {
        if(isSignedUpForNewsletter){
            System.out.println("Sale: " + price/2 + "zł");
        } else {
            System.out.println("User is not signed to newsletter, please choose another price strategy!");
        }
    }
}
