package utilities;


public class AnimalShelter {

    private Queue<Animal> animalQueue;
    private Queue<Animal> auxQueue;

    public AnimalShelter() {
        this.animalQueue = new Queue<>();
        this.auxQueue = new Queue<>();
    }

    public void enqueue(Animal animalToShelter) {
        this.animalQueue.enqueue(animalToShelter);
    }

    public Animal dequeue(String preference) {

        Animal animalToAdopt = null;

        while (!animalQueue.isEmpty()) {

            if (preference.equals(animalQueue.peek().toString()) && animalToAdopt == null) {
                animalToAdopt = animalQueue.dequeue();
            } else {
                auxQueue.enqueue(animalQueue.dequeue());
            }
        }

        while (!auxQueue.isEmpty()) {
            animalQueue.enqueue(auxQueue.dequeue());
        }

        return animalToAdopt;
    }

    public String toString() {
        return animalQueue.toString();
    }
}
