package OOPTVNetwork2;

public class BasicMember extends Member { //1

    public BasicMember(String memberId, String name, MembershipTier tier) {
        super(memberId, name, tier);
    }

    @Override
    public double getMonthlyFee() {
        return 9.99;
    }

    @Override
    public String getBenefits() {
        return "Access to standard channel Library";
    }
}
