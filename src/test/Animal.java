/*
Overloading Methods – Passing and returning objects
Sample Question
Write an application to perform the method overloading and passing, returning the objects
for the behaviour of the domestic animal, wild animal, birds, carnivores, herbivores,
omnivores
 */

package src.test;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void move() {
        System.out.println(name + " is moving.");
    }
}

class DomesticAnimal extends Animal {
    public DomesticAnimal(String name) {
        super(name);
    }

    public void play() {
        System.out.println(getName() + " is playing.");
    }
}

class WildAnimal extends Animal {
    public WildAnimal(String name) {
        super(name);
    }

    public void hunt() {
        System.out.println(getName() + " is hunting.");
    }
}

class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    public void fly() {
        System.out.println(getName() + " is flying.");
    }
}

class Carnivore extends Animal {
    public Carnivore(String name) {
        super(name);
    }

    public void hunt(Animal prey) {
        System.out.println(getName() + " is hunting " + prey.getName() + ".");
    }
}

class Herbivore extends Animal {
    public Herbivore(String name) {
        super(name);
    }

    public void graze() {
        System.out.println(getName() + " is grazing.");
    }
}

class Omnivore extends Animal {
    public Omnivore(String name) {
        super(name);
    }

    public void eat(Animal food) {
        System.out.println(getName() + " is eating " + food.getName() + ".");
    }
}

 class AnimalApp {
    public static void main(String[] args) {
        DomesticAnimal cat = new DomesticAnimal("Cat");
        cat.eat(); // Output: Cat is eating.
        cat.move(); // Output: Cat is moving.
        cat.play(); // Output: Cat is playing.

        WildAnimal lion = new WildAnimal("Lion");
        lion.eat(); // Output: Lion is eating.
        lion.move(); // Output: Lion is moving.
        lion.hunt(); // Output: Lion is hunting.

        Bird eagle = new Bird("Eagle");
        eagle.eat(); // Output: Eagle is eating.
        eagle.move(); // Output: Eagle is moving.
        eagle.fly(); // Output: Eagle is flying.

        Carnivore wolf = new Carnivore("Wolf");
        Herbivore deer = new Herbivore("Deer");
        wolf.hunt(deer); // Output: Wolf is hunting Deer.

        Omnivore bear = new Omnivore("Bear");
        bear.eat(cat); // Output: Bear is eating Cat.
    }
}
