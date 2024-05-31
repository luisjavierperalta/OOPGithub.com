package JavaOOPTvNetworkService;

/**
 * This class represent @PremiumSub tier @SubClass (Child), it extends @BasicSubscription @SuperClass (Parent) (Inheritance benefits)
 * Will inherit all @BasicSub features (fields & methods), plus add-on specific to @PremiumSub features, @On-demand content
 */
public class PremiumSubscription extends BasicSubscription { //1 To declare @PS, next extends @BasicSubscription class
    //2 To declare @PremiumSub specific fields
    private static final double PREMIUM_PRICE = 14.99;
    private static final String[] PREMIUM_CHANNELS = {"Premium Channel 4", "Premium Channel 5", "Premium Channel 6"};

    //3 To @Override any @BasicSub methods
    @Override
    public double getMonthlyPrice() {
        return super.getMonthlyPrice() + PREMIUM_PRICE;
    }

    //4 Combining all available Channels from @BasicSub @PremiumSub
    //https://gemini.google.com/u/0/app/79aff51c3018ed54
    @Override
    public String[] getChannelsIncluded() {
        String[] combinedChannels = new String[super.getChannelsIncluded().length + PREMIUM_CHANNELS.length];
        System.arraycopy(super.getChannelsIncluded(),0, combinedChannels,0,super.getChannelsIncluded().length);
        System.arraycopy(PREMIUM_CHANNELS,0, combinedChannels, super.getChannelsIncluded().length, PREMIUM_CHANNELS.length);
        return combinedChannels;

    }

    @Override
    public String getLocalizedDescription() {
        return super.getLocalizedDescription() + "Premium channels & on-demand content";

    }


}
