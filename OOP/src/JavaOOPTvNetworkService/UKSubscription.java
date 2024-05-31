package JavaOOPTvNetworkService;

public class UKSubscription extends CountrySpecificSubscription{ //1
    //2
    private BasicSubscription basicPlan;
    private PremiumSubscription premiumPlan;

    //3 @USSub constructor
    public UKSubscription() {
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
        return "Basic plan with essential channels";
    }

    @Override
    public String getLanguage() {
        return "English (UK)";
    }
}
