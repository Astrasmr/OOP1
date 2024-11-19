package model;

import java.util.Objects;

public class KogtevranStudent extends HogwartsStudent {
    private int cunning;
    private int creative;
    private int witty;
    private int wise;
    private int clever;

    public KogtevranStudent(String fullName,
                            int power,
                            int transgration,
                            int cunning,
                            int creative,
                            int witty,
                            int wise,
                            int clever) {
        super(fullName, power, transgration);
        this.cunning = cunning;
        this.creative = creative;
        this.witty = witty;
        this.wise = wise;
        this.clever = clever;
    }
    public void challengeStudent(KogtevranStudent opponent) {
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
        return cunning + creative +
                witty + wise +
                clever + power + transgration;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getСreative() {
        return creative;
    }

    public void setCreative (int creative ) {
        this.creative  = creative ;
    }

    public int getWise() {
        return wise;
    }

    public void setWise (int wise) {
        this.wise = wise;
    }

    public int getClever() {
        return clever;
    }

    public void setClever(int clever) {
        this.clever = clever;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        model.KogtevranStudent that = (model.KogtevranStudent) o;
        return cunning == that.cunning && creative == that.creative
                && wise == that.wise && clever == that.clever
                && witty == that.witty;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cunning, creative,
                wise, clever, witty);
    }

    @Override
    public String toString() {
        return "%s,%s,%s,%s,%s,%s".formatted(super.toString(),cunning, creative,
                wise, clever, witty);
    }

}
