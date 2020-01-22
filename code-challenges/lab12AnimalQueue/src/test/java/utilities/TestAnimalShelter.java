package utilities;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestAnimalShelter {

    AnimalShelter shelter;

    @Before
    public void initAnimalShelter() {
        shelter = new AnimalShelter();

        Animal dog1 = new Dog();
        Animal dog2 = new Dog();
        Animal dog3 = new Dog();
        Animal dog4 = new Dog();
        Animal dog5 = new Dog();

        Animal cat1 = new Cat();
        Animal cat2 = new Cat();
        Animal cat3 = new Cat();
        Animal cat4 = new Cat();
        Animal cat5 = new Cat();

        shelter.enqueue(dog1);
        shelter.enqueue(dog2);
        shelter.enqueue(cat1);
        shelter.enqueue(dog3);
        shelter.enqueue(cat2);
        shelter.enqueue(cat3);
        shelter.enqueue(dog4);
        shelter.enqueue(cat4);
        shelter.enqueue(dog5);
        shelter.enqueue(cat5);
    }

    @Test public void testAnimalShelter_DequeueAllCats() {
        // check string before
        String actual = shelter.toString();
        String expected = "FRONT -> (dog) -> (dog) -> (cat) -> (dog) -> (cat) -> (cat) -> (dog) -> (cat) -> (dog) -> (cat) -> BACK";
        assertEquals(expected, actual);

        // REMOVE ALL CATS
        Animal nextAnimal = shelter.dequeue("cat");
        assertEquals("cat", nextAnimal.toString());

        nextAnimal = shelter.dequeue("cat");
        assertEquals("cat", nextAnimal.toString());

        nextAnimal = shelter.dequeue("cat");
        assertEquals("cat", nextAnimal.toString());

        nextAnimal = shelter.dequeue("cat");
        assertEquals("cat", nextAnimal.toString());

        nextAnimal = shelter.dequeue("cat");
        assertEquals("cat", nextAnimal.toString());

        // check string after
        actual = shelter.toString();
        expected = "FRONT -> (dog) -> (dog) -> (dog) -> (dog) -> (dog) -> BACK";
        assertEquals(expected, actual);
    }

    @Test public void testAnimalShelter_DequeueAllDogs() {

        // check string before
        String actual = shelter.toString();
        String expected = "FRONT -> (dog) -> (dog) -> (cat) -> (dog) -> (cat) -> (cat) -> (dog) -> (cat) -> (dog) -> (cat) -> BACK";
        assertEquals(expected, actual);

        // REMOVE ALL DOGGOS
        Animal nextAnimal = shelter.dequeue("dog");
        assertEquals("dog", nextAnimal.toString());

        nextAnimal = shelter.dequeue("dog");
        assertEquals("dog", nextAnimal.toString());

        nextAnimal = shelter.dequeue("dog");
        assertEquals("dog", nextAnimal.toString());

        nextAnimal = shelter.dequeue("dog");
        assertEquals("dog", nextAnimal.toString());

        nextAnimal = shelter.dequeue("dog");
        assertEquals("dog", nextAnimal.toString());

        // check string after
        actual = shelter.toString();
        expected = "FRONT -> (cat) -> (cat) -> (cat) -> (cat) -> (cat) -> BACK";
        assertEquals(expected, actual);
    }

    @Test public void testAnimalShelter_DequeueAllPets() {

        // check string before
        String actual = shelter.toString();
        String expected = "FRONT -> (dog) -> (dog) -> (cat) -> (dog) -> (cat) -> (cat) -> (dog) -> (cat) -> (dog) -> (cat) -> BACK";
        assertEquals(expected, actual);

        // REMOVE ALL DOGGOS
        shelter.dequeue("dog");
        shelter.dequeue("dog");
        shelter.dequeue("dog");
        shelter.dequeue("dog");
        shelter.dequeue("dog");
        // REMOVE ALL CATS
        shelter.dequeue("cat");
        shelter.dequeue("cat");
        shelter.dequeue("cat");
        shelter.dequeue("cat");
        shelter.dequeue("cat");

        // check string after
        actual = shelter.toString();
        expected = "FRONT -> BACK";
        assertEquals(expected, actual);
    }

    @Test public void testAnimalShelter_DequeueBadInputString() {
        Animal actual = shelter.dequeue("honeyBadger");
        assertEquals(null, actual);
    }

    @Test public void testAnimalShelter_DequeueEmptyAnimalShelter() {
        AnimalShelter emptyShelter = new AnimalShelter();
        Animal actual = emptyShelter.dequeue("honeyBadger");
        assertEquals(null, actual);

        actual = emptyShelter.dequeue("dog");
        assertEquals(null, actual);

        actual = emptyShelter.dequeue("cat");
        assertEquals(null, actual);
    }

}
