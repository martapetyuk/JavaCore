package Lesson1;

public class Turtle extends Animal{

    private double swimmingSpeed;

    // dobavit konstructor
    public Turtle(String name, String color, int age){
        super(name, color, age);
    }

    // sozdaet zvuk
    public void voice(){
        System.out.println("Turtle izdaet zvuk");
    }

    public double getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(double swimminSpped) {
        this.swimmingSpeed = swimminSpped;
    }

    public double swim(Pool pool){
        System.out.println("Ya turtle. Ya plivu");
        double timeToOvercome = pool.getLength() / swimmingSpeed;
        return timeToOvercome;
    }
}
