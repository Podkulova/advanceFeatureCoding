package example.animals;

public abstract class Animal {
    private int legCount;

    public abstract String sayHello();

    public void setLegCount(int legCount) {
        this.legCount = legCount;
    }

    public int getLegsNumber() {
        return legCount;
    }

    public String introduceYourSelf() {
        return sayHello() + " I have " + legCount + " legs.";
    }
}
