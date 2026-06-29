package lsp;

abstract class Animal {
    public abstract String makeSound();
}

interface Walkable {
    String walk();
}

class Dog extends Animal implements Walkable {
    @Override
    public String makeSound() {
        return "Dog barks.";
    }

    @Override
    public String walk() {
        return "Dog is walking.";
    }
}

class Fish extends Animal {
    @Override
    public String makeSound() {
        return "Fish makes bubbles.";
    }
}

public class AnimalSystem {
    public static void main(String[] args) {
        System.out.println("--- Sistema de Zoológico (Aplicando LSP) ---\n");

        Animal dog = new Dog();
        Animal fish = new Fish();

        System.out.println("Demostrando sonidos (Comportamiento Base):");
        System.out.println(dog.makeSound());
        System.out.println(fish.makeSound());

        System.out.println("\nDemostrando movimiento:");

        if (dog instanceof Walkable) {
            System.out.println(((Walkable) dog).walk());
        }

        if (fish instanceof Walkable) {
            System.out.println(((Walkable) fish).walk());
        } else {
            System.out.println("El pez no implementa, por lo que el sistema no permite que camine.");
        }
    }
}