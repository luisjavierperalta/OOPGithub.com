package JavaOOPTvNetworkService;

public class FranceSubscription extends CountrySpecificSubscription {
    //2
    private BasicSubscription basicPlan;
    private PremiumSubscription premiumPlan;

    //3 @USSub constructor
    public FranceSubscription() {
        this.basicPlan = new BasicSubscription();
        this.premiumPlan = new PremiumSubscription();

    }

    //4 @Override methods

    @Override
    public double getMonthlyPrice() {
        return basicPlan.getMonthlyPrice();
    }

    @Override
    public String[] getChannelsIncluded() {
        return basicPlan.getChannelsIncluded();
    }

    @Override
    public String getLocalizedDescription() {
        return "forfait de base avec chaînes essentielles";
    }

    @Override
    public String getLanguage() {
        return "France (FR)";
    }
}
