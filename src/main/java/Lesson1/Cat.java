package Lesson1;

import java.util.Objects;
// implements iz canswimm
public class Cat extends Animal implements CanSwimm{

    // svoistvenno tolko dlya cat
    // sozdat det iset
    private boolean inWild;
    private double swimmingSpeed; // drobnoe chislo



   // public Cat(){} создаться пустой конструктор
    public Cat(String name, String color, int age){
        super(name, color, age);
    }

    //zhitnoe izdaet zvuk
    public void voice(){
        System.out.println("Cat mya");
    }

    public boolean isInWild() {
        return inWild;
    }

    public void setInWild(boolean inWild) {
        this.inWild = inWild;
    }

    public double getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(double swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    // zatratil vremya dlya plit
    public double swim(Pool pool){
        System.out.println("Ya cat. Ya plivu");
        double timeToOvercome = pool.getLength() / swimmingSpeed;
        return timeToOvercome;
    }
}