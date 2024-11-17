package model;

import java.util.Objects;

public abstract class HogwartsStudent {
    protected String fullName;
    protected int power;
    protected int transgration;
    public HogwartsStudent (String fullName, int power, int transgration){
        this.fullName = fullName;
        this.power = power;
        this.transgration = transgration;
    }
    //public abstract void challengeStudent(HogwartsStudent opponent);

    protected abstract int getSummPower ();

    public String getFullName() {
        return fullName;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getTransgration() {
        return transgration;
    }

    public void setTransgration(int transgration) {
        this.transgration = transgration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HogwartsStudent that = (HogwartsStudent) o;
        return power == that.power && transgration == that.transgration && Objects.equals(fullName, that.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, power, transgration);
    }

    @Override
    public String toString() {
        return "%s,%s,%s,%s".formatted(this.getClass().getSimpleName(),
                fullName, power, transgration);
    }
}
