package JavaOOPTvNetworkService;

/**
 * @ BasicSub represent basic SubPlan which implements @Subscription Interface
 */
public  class BasicSubscription implements Subscription { //1 To declare public class @BasicSub, next @implements @Subscription
    //2 To declare class specific fields
    private static final double BASE_PRICE = 9.99;
    private static final String[] BASE_CHANNELS = {"Channel1", "Channel2", "Channel3"};

    //3 @Override @Subscription interface abstract methods
    @Override
    public double getMonthlyPrice() {
        return BASE_PRICE;
    }

    @Override
    public String[] getChannelsIncluded() {
        return BASE_CHANNELS;
    }

    @Override
    public String getLocalizedDescription() {
        return "Basic plan with essential channels";
    }

}
