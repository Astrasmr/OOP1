package model;

import java.util.Objects;

public class GriffindorStudent extends HogwartsStudent {
    private int nobility;
    private int honor;
    private int courage;

    public GriffindorStudent(String fullName,
                             int power,
                             int transgration,
                             int nobility,
                             int honor,
                             int courage) {
        super(fullName, power, transgration);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public void challengeStudent(GriffindorStudent opponent) {
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
        return nobility + honor + courage + power + transgration;
    }

    public int getNobility() {
        return nobility;
    }


    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        GriffindorStudent that = (GriffindorStudent) o;
        return nobility == that.nobility && honor == that.honor && courage == that.courage;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nobility, honor, courage);
    }

    @Override
    public String toString() {

        return "%s,%s,%s,%s".formatted(super.toString(),nobility, honor, courage);
    }

}
