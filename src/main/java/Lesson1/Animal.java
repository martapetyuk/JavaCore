package Lesson1;

import java.util.Objects;

public abstract class Animal {

   private String name;
    private String color;
    private int age;

    public Animal(String name, String color, int age) {
            this.name = name;
            this.color = color;
            this.setAge(age); //this.age = age;
        }


    @Override  // alt+insert создать метод to string
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    @Override // alt+insert создать метод equals для сравнения ссылок(строк)
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal cat = (Animal) o;
        return age == cat.getAge() && Objects.equals(name, cat.getName()) && Objects.equals(color, cat.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, color, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0)this.age = age; // dopolnitelnoe ogranichenie
    }


    // sozdaenie zvuka dlya vseh zhivotnih. sodat abstract metod
    public abstract void voice(); // shtobi ne bilo oshibki
    //class animal sdelat tozhe abstract
    // ili sozdat telo


}
