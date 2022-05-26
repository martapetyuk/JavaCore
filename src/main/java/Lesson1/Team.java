package Lesson1;

import java.util.Random;

public class Team {
    private String nameTeam;
    Animal[] zoo = {new Cat("Murzik", "white", 2), new Wolf("Hurry", "grey", 2), new Turtle("Slow", "brown", 35)};
    public Animal[] teamAnimal = new Animal[4];
    Random random = new Random();

    public Team(String nameTeam) { // sozdanie comandi
        this.nameTeam = nameTeam;
        for (int i = 0; i < 4; i++) {
            int ran = random.nextInt(3);
            teamAnimal[i] = zoo[ran];
        }
    }

    // Вывод информации кто прошел дистанцию
    public void passedTheDistance() {
        System.out.println(nameTeam + "\n");
        for (Animal a : teamAnimal) {
           /* if(a){
                System.out.println(a + " successfully passed the distance.\n");
            } else {
                System.out.println(a + " did not pass the distance.\n");
            }
        }
        System.out.println();*/
        }
    }
}