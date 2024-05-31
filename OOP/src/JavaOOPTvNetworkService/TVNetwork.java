package JavaOOPTvNetworkService;

import javax.swing.*;

/**
 * This class represent the main class (entry-point) of the program 
 */
public class TVNetwork { //1 
    //2 
    public static void main(String[] args) {
        //3 Create subscription (real-world objects) for different countries 
        Subscription usSub = new USSubscription();
        Subscription frSub = new FranceSubscription();
        Subscription brazilSub = new BrazilSubscription();
        Subscription ukSub = new UKSubscription();
        
        //4 Display information for each subscription created 
        System.out.println("US Subscription");
        System.out.println("Monthly price: $" + usSub.getMonthlyPrice());
        System.out.println("Channels Included:" + String.join(",", usSub.getChannelsIncluded()));
        System.out.println("Description:" + usSub.getLocalizedDescription());

        System.out.println("France Subscription");
        System.out.println("Monthly price: $" + frSub.getMonthlyPrice());
        System.out.println("Channels Included:" + String.join(",", frSub.getChannelsIncluded()));
        System.out.println("Description:" + frSub.getLocalizedDescription());

        System.out.println("\n Brazil Subscription");
        System.out.println("Monthly price: $" + brazilSub.getMonthlyPrice());
        System.out.println("Channels Included:" + String.join(",", brazilSub.getChannelsIncluded()));
        System.out.println("Description:" + brazilSub.getLocalizedDescription());

        System.out.println("\n UK Subscription");
        System.out.println("Monthly price: $" + ukSub.getMonthlyPrice());
        System.out.println("Channels Included:" + String.join(",", ukSub.getChannelsIncluded()));
        System.out.println("Description:" + ukSub.getLocalizedDescription());
        
    }
}
