package OOPTVNetwork2;

public class VIPMember extends Member { //1
    //2

    public VIPMember(String memberId, String name, MembershipTier tier) {
        super(memberId, name, tier);
    }

    //2

    @Override
    public double getMonthlyFee() {
        return 19.99;
    }

    @Override
    public String getBenefits() {
        return "Access to all channels & exclusive VIP offers";
    }
}
