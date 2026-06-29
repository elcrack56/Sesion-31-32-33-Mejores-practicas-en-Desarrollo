package lsp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnimalSystemTest {
    @Test
    void testDogBehavior() {
        Dog dog = new Dog();
        assertEquals("Dog barks.", dog.makeSound());
        assertEquals("Dog is walking.", dog.walk());
    }

    @Test
    void testFishBehavior() {
        Fish fish = new Fish();
        assertEquals("Fish makes bubbles.", fish.makeSound());
    }
}