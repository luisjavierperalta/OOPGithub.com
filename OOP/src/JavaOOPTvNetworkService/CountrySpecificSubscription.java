package JavaOOPTvNetworkService;

import jdk.jshell.JShell;

/**
 * This class represent @SubPlans for specific country @UK @France @Italy
 * Implemented as abstract class (Shared Class), and ofc extends @Subscription Interface
 * Define country-specific methods @getLanguage();
 */

public abstract class CountrySpecificSubscription implements Subscription { //1 To declare @CSS public abstract class, next extends @Subscription Interface
 //Reusability (shared logic in the abstract class) & Consistency between @Sub SuperClass @SubClasses

    //1 Declaring specific @CSB abstract method
    public abstract String getLanguage();


}
