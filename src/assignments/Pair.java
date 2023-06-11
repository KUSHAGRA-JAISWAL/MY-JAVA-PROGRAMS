package src.assignments;

class MyPair {
    // user-defined MyPair class

    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        // A method for comparing two objects of pair class

        return p1.getKey().equals(p2.getKey());
        // && p1.getValue().equals(p2.getValue());
        // returns the result as true or false by comparing key and values.
    }
}

public class Pair<K, V> {

    private K key;
    private V value;
    // making variables of datatype K and V.

    public Pair(K key, V value) {
        // parameterise constructor.
        this.key = key;
        this.value = value;
    }

    public void setKey(K key) {
        // set method for key
        this.key = key;
    }

    public K getKey() {
        // get method for key
        return key;
    }

    public void setValue(V value) {
        // set method for value
        this.value = value;
    }

    public V getValue() {
        // get method for value
        return value;
    }

    public static void main(String[] args) {
        // main

        Pair<Integer, String> p1 = new Pair<>(1, "Hello");
        Pair<Integer, String> p2 = new Pair<>(2, "Java");
        Pair<Integer, String> p3 = new Pair<>(2, "Java");
        // creating object of Pair class and passing Integer and String values in it.

        System.out.println("Is p1 = p2 ?: " + MyPair.compare(p1, p2));
        System.out.println("Is p2 = p3 ?: " + MyPair.compare(p2, p3));
        System.out.println("Is p3 = p1 ?: " + MyPair.compare(p3, p1));
        // calling the function and printing the result.

    }
}