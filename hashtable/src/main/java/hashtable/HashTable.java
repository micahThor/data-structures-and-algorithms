// adapted from https://www.geeksforgeeks.org/implementing-our-own-hash-table-with-separate-chaining-in-java/

package hashtable;

import java.util.ArrayList;

public class HashTable<K, V> {

    ArrayList<HashNode<K, V>> bucketArray;
    private int numOfBuckets;
    private int size;

    public HashTable() {
        this.size = 10;
        this.numOfBuckets = 10;
        this.bucketArray = new ArrayList<>(numOfBuckets);

        for (int i = 0; i < numOfBuckets; i++)
            this.bucketArray.add(null);
    }

    public HashTable(int initialCapacity) {
        this.size = initialCapacity;
        this.numOfBuckets = initialCapacity;
        this.bucketArray = new ArrayList<>(numOfBuckets);

        for (int i = 0; i < numOfBuckets; i++)
            this.bucketArray.add(null);
    }

    public void add(K key, V value) {

        // get index to insert
        int indexToInsertNode = hash(key);

        // construct new node and set new node next to front of pseudo linked list
        HashNode<K, V> newNode = new HashNode<>(key, value);
        HashNode<K, V> head = this.bucketArray.get(indexToInsertNode);

        // add to bucket and increase size
        this.size++;
        newNode.next = head;
        this.bucketArray.set(indexToInsertNode, newNode);

        // increase size if load factor meets or exceeds 70% capacity
        if ((1.0*size)/this.numOfBuckets >= 0.7)  {
            ArrayList<HashNode<K, V>> temp  = this.bucketArray;
            this.numOfBuckets *= 2;
            this.bucketArray = new ArrayList<>(numOfBuckets);
            this.size = 0;

            for (int i = 0; i < this.numOfBuckets; i++)
                this.bucketArray.add(null);

            for (HashNode<K, V> headNode : temp) {
                while (headNode != null) {
                    this.add(headNode.key, headNode.value);
                    headNode = headNode.next;
                }
            }
        }

    }

    public V get(K key) {

        // get location of key and set head
        int index = hash(key);
        HashNode<K, V> head = this.bucketArray.get(index);

        // attempt to mach key
        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }

        return null;
    }

    public boolean contains(K key) {
        return this.get(key) != null;
    }

    public int hash(K key) {
        int hashCode = key.hashCode();
        int index = Math.abs(hashCode % this.numOfBuckets);
        return index;
    }

    public int getSize() {
        return this.size;
    }

    public int getNumOfBuckets() {
        return this.numOfBuckets;
    }
}