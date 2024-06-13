package OOPTVNetwork2;

public class BasicSubscription implements Subscription { //1 @Child class implements @Subscription
    //2 fields
    private static final double BASE_PRICE = 9.99;
    private static final String[] BASE_CHANNELS = {"Channel1", "Channel2", "Channel3"};

    //3 @Override abstract's methods


    @Override
    public double getMonthlyPrice() {
        return BASE_PRICE;
    }

    @Override
    public String[] getChannlesIncluded() {
        return BASE_CHANNELS;
    }

    @Override
    public String getLocalizedDescription() {
        return "Basic Plan with Basic Channels";
    }
}
