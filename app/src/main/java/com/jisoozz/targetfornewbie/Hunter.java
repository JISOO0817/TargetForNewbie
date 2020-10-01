package com.jisoozz.targetfornewbie;

public class Hunter {

    int profile;
    String tier;
    String job;
    String name;

    public Hunter(int profile, String tier, String job,String name) {
        this.profile = profile;
        this.tier = tier;
        this.job = job;
        this.name = name;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
