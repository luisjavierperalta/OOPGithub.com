package JavaOOPTvNetworkService;

/**
 * Fictional TV Network Service @GlobalStreams, offering streaming services in multiple countries with different
 * subscription plans.
 * OPTION 1: Single Interface with multiple SubClasses (Shared Interface & Inheritance)
 * OPTION 2: Multiple Interfaces
 */

public interface Subscription { //1 To declare public interface @Sub
    //2 To declare 3x abstract methods
    double getMonthlyPrice(); //@Sub's monthly payment price
    String[] getChannelsIncluded(); //@Sub's plan included TVChannels
    String getLocalizedDescription(); //

}
