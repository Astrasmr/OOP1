package model;

import java.util.Objects;

public class SlizerinStudent extends HogwartsStudent {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public SlizerinStudent(String fullName,
                           int power,
                           int transgration,
                           int cunning,
                           int determination,
                           int ambition,
                           int resourcefulness,
                           int thirstForPower) {
        super(fullName, power, transgration);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }
    public void challengeStudent(SlizerinStudent opponent) {
        if (this.getSummPower() > opponent.getSummPower()) {
            System.out.println(fullName + " победил");
        } else if (getSummPower() < opponent.getSummPower()) {
            System.out.println(opponent.fullName + " победил");
        } else {
            System.out.println("Ничья");
        }
    }

    @Override
    protected int getSummPower() {
        return cunning + determination +
                ambition + resourcefulness +
                thirstForPower + power + transgration;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SlizerinStudent that = (SlizerinStudent) o;
        return cunning == that.cunning && determination == that.determination && ambition == that.ambition && resourcefulness == that.resourcefulness && thirstForPower == that.thirstForPower;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cunning, determination,
                ambition, resourcefulness, thirstForPower);
    }

    @Override
    public String toString() {
        return "%s,%s,%s,%s,%s,%s".formatted(super.toString(),cunning, determination, ambition,
                resourcefulness, thirstForPower);
    }

    }

