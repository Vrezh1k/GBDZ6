/**
 * Java.Homework6
 *
 * @author Vrezh Sargsyan
 * @version 23.11.2021
 */

public class Lesson6 {
    public static void main(String[] args) {
        Cat cat = new Cat(200, 0);
        Dog dog = new Dog(500, 10);

        IAnimal[] animals = {cat, dog};
        for (IAnimal animal : animals) {
            System.out.println(animal);
            System.out.println(animal.run(100));
            System.out.println(animal.run(200));
            System.out.println(animal.run(700));
            System.out.println(animal.swim(5));
            System.out.println(animal.swim(100));
        }
    }
}

interface IAnimal {
    String run(int distance);
    String swim(int distance);
}

abstract class Animal implements IAnimal {
    protected int runLimit;
    protected int swimLimit;
    protected String className;

    Animal(int runLimit, int swimLimit) {
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        className = getClass().getSimpleName();
    }

    @Override
    public String swim(int distance) {
        if (distance > swimLimit) {
            return className + " can't swim" + " " + distance;
        } else {
            return className + " swim" + " " + distance;
        }
    }


    @Override
    public String run(int distance) {
        if (distance > runLimit) {
            return className + " can't run" + " " + distance;
        } else {
            return className + " run" + " " + distance;
        }
    }
    @Override
    public String toString() {
        return className + " runLimit:" + runLimit + ", swimLimit:" + swimLimit;
    }
}



class Cat extends Animal {
    Cat(int runLimit, int swimLimit) {
        super(runLimit, swimLimit);
    }
}

class Dog extends Animal {
    Dog(int runLimit, int swimLimit) {
        super(runLimit, swimLimit);
    }
}
