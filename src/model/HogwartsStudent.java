package model;

import java.util.Objects;

public class HogwartsStudent {
    protected String fullName;
    protected int power;
    protected int transgration;
    public HogwartsStudent (String fullName, int power, int transgration){
        this.fullName = fullName;
        this.power = power;
        this.transgration = transgration;
    }
    public void challengeStudent(HogwartsStudent opponent) {
        if (getSummPower() > opponent.getSummPower()) {
            System.out.println(fullName + " победил");
        } else if (getSummPower() < opponent.getSummPower()) {
            System.out.println(opponent.fullName + " победил");
        } else {
            System.out.println("Ничья");
        }
    }

    protected int getSummPower () {
         return power + transgration;
    }

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
