package OOPTVNetwork2;

public class PremiumMember extends Member { //1
    //2

    public PremiumMember(String memberId, String name, MembershipTier tier) {
        super(memberId, name, tier);
    }

    //3

    @Override
    public double getMonthlyFee() {
        return 14.99;
    }

    @Override
    public String getBenefits() {
        return "Access to standard channels + add-on premium channels & On-demand content";
    }
}
