package OOPTVNetwork2;

public abstract class Member { //1
    //2 fields
    private String memberId;
    private String name;
    private MembershipTier tier;

    //2

    public Member(String memberId,String name,MembershipTier tier ) {

        this.memberId = memberId;
        this.name = name;
        this.tier = tier;
    }

    //3 Getters

    public String getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public MembershipTier getTier() {
        return tier;
    }

    //4 Abstract methods for child Classes
    public abstract double getMonthlyFee();

    public abstract String getBenefits();
}
