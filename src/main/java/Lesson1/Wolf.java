package Lesson1;

public class Wolf extends Animal implements CanSwimm{ // nasledovanie
    public Wolf(String name, String color, int age) {
        super(name, color, age);
    }

    private double swimmingSpeed;

    // sozdat zvuk
    public void voice(){
        System.out.println("Wolf voet");
    }

    public double getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(double swimmingSpee) {
        this.swimmingSpeed = swimmingSpeed;
    }

    //
    public double swim(Pool pool){
        System.out.println("Ya Wolf. Ya plivu");
        double timeToOvercome = pool.getLength() / swimmingSpeed;
        return timeToOvercome;
    }
}
