package com.jisoozz.targetfornewbie;

public class Character  {

    int profile;
    String job;
    String name;
    int a;
    int b;

    public Character(int profile, String job, String name,int a, int b) {
        this.profile = profile;
        this.job = job;
        this.name = name;
        this.a = a;
        this.b = b;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
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


    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}
