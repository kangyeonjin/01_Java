package com.ohgiraffers.section02.terminal;

public class Member {

    private String memberId;
    private String getMemberName;

    public Member() {

    }

    public Member(String memberId, String getMemberName) {
        this.memberId = memberId;
        this.getMemberName = getMemberName;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getGetMemberName() {
        return getMemberName;
    }

    public void setGetMemberName(String getMemberName) {
        this.getMemberName = getMemberName;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId='" + memberId + '\'' +
                ", getMemberName='" + getMemberName + '\'' +
                '}';
    }


}
