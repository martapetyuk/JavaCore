package Lesson1;
// object ot nego vse nasleduetsa ctr+n

public class Main {
    public static void main(String[]args) {
        Cat cat = new Cat("Barsik", "black", 1); // sozdali kota


        System.out.println(cat);

        Cat cat1 = new Cat("Moris", "black", 1);
        Cat cat2 = new Cat("Moris", "black", 1);

        System.out.println(cat1.equals(cat2)); // equals сравнение двух ссылок
        //
        Cat cat3 = new Cat("Moris", "black", 2);
        System.out.println(cat2.hashCode());
        System.out.println(cat3.hashCode());

        //sozdat new wolf
        Wolf wolf = new Wolf("Treter", "grey", 6);


        Animal cat4 = new Cat("Moris", "gold", 10);

        if (cat4 instanceof Wolf) { // proverka na yavnoe privedenie tipov
            Wolf wolf5 = (Wolf) cat4; //
        }
        else System.out.println("Ne yavlyaetsa Wolf");

     // sodaem kota i ukazat plus odin god k vozrastu. v construktor ukazat dannie v private
       // dalshe sozdat get i set v roditelskom classe
        //v set ukazat ogranicheniya
        Cat cat5 = new Cat("Barsik", "white", 2);
        cat5.setAge(3);
        System.out.println(cat5);
    }





}
