package model;

import java.util.Objects;

public class PofeondoiStudent extends HogwartsStudent {
    private int hardWork;
    private int loyalty;
    private int honesty;

    public PofeondoiStudent(String fullName,
                            int power,
                            int transgration,
                            int hardWork,
                            int loyalty,
                            int honesty) {
        super(fullName, power, transgration);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public void challengeStudent(PofeondoiStudent opponent) {
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
        return hardWork + loyalty + honesty + power + transgration;
    }

    public int getHardWork() {
        return hardWork;
    }


    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PofeondoiStudent that = (PofeondoiStudent) o;
        return hardWork == that.hardWork && loyalty == that.loyalty && honesty == that.honesty;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hardWork, loyalty, honesty);
    }

    @Override
    public String toString() {

        return "%s,%s,%s,%s".formatted(super.toString(), hardWork, loyalty, honesty);
    }

}
