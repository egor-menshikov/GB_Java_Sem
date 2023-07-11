package Sem_6_real.Task_2;

import java.util.Objects;

public class Cat {
    String name;
    String owner;
    int numPassport;
    int age;
    String color;

    public Cat() {

    }

    public Cat(String name, String color, int age) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cat cat)) {
            return false;
        }
        return name.equalsIgnoreCase(cat.name) && age == cat.age && color.equalsIgnoreCase(cat.color);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + 7 * age + 13 * color.hashCode();
    }
}
