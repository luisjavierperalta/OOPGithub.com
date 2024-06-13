package OOPTVNetwork2;

/**
 * This an OOP Coding challenge for building an International @TVNetworkService Platform
 * The platform aims to provide users (@Subscriber) different streaming services based on
 * different membership plans.
 *Software Design plan:
 * Based on DDD (Domain Driven Design)
 * Core Domain Objects:
 * 1 Subscription
 * To represent user's plan with details price, channels included and localized description
 * 2 Member
 * To represent user with membership tier @Basic, @Premium @VIP + benefits
 *
 * Relationship:
 * User can have 1x Sub (based on plan chosen)
 * User can have 1x membership Tier linked to they're account
 *
 * Class Structure:
 * 1 Subscription Interface
 * 2 Child Subscription Classes @BasicSubscription @PremiumSubscription
 * 3 Members
 * 3.1 Memberships with @Enum for @Basic @Premium @VIP
 * 3.2 Member Abstract class @Core member fields and @Abstract methods
 * 3.2 Child member classes @BasicMember @PremiumMember @VIPMember
 *
 *
 *
 *
 */

public interface Subscription { //1
    //2 Abstract method
    double getMonthlyPrice();
    //2.1
    String[] getChannlesIncluded();
    //2.2
    String getLocalizedDescription();

}
