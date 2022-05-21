package Lesson1;

public class Pool {
    private double length; // dlinna

    // construktor
    public Pool(double length){
        this.length = length;
    }

    // get and set
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // metod za kakoe vremya preodalet pool
    // sozdat class-interfiece canSwimm
    public double getTimeToOvercome(CanSwimm swimmer){
        return swimmer.swim(this);
    }
}
