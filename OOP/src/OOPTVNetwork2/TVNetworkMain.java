package OOPTVNetwork2;

public class TVNetworkMain { //1
    //2
    public static void main(String[] args) {
        //3
        Member basicMember = new BasicMember("M123", "Chris Wood", MembershipTier.BASIC);
        Member premiumMember = new PremiumMember("M456", "John Smith", MembershipTier.PREMIUM);
        Member VipMember = new VIPMember("M999", "Alice JJ", MembershipTier.VIP);

        //4
        System.out.println("\nMember details:");
        System.out.println(basicMember.getName() + " " + basicMember.getTier());
        System.out.println("Monthly Fee:" + basicMember.getMonthlyFee());
        System.out.println("Benefits:" + basicMember.getBenefits());

    }
}
