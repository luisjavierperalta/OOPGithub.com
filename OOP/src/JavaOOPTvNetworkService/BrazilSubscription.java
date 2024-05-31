package JavaOOPTvNetworkService;

import java.util.zip.CheckedOutputStream;

public class BrazilSubscription extends CountrySpecificSubscription { //1
    //2
    private BasicSubscription basicPlan;
    private PremiumSubscription premiumPlan;

    //3 @USSub constructor
    public BrazilSubscription() {
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
        return "Plano bàsico con canais essenciais (Portuguese Translation)";
    }

    @Override
    public String getLanguage() {
        return "Portuguese (Brazil)";
    }
}
