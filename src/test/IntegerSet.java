/* 
1) Apply the concepts like Classes, objects, Arrays, Controlling access to members – this, static,
and final keywords
Sample questions
Create class IntegerSet. Each IntegerSet object can hold integers in the range 0–100. The set
is represented by an array of booleans. Array element a[i] is true if integer i is in the set. Array
element a[j] is false if integer j is not in the set. The no-argument constructor initializes the
array to the “empty set” (i.e., all false values). Provide the following methods: The static
method union creates a set that’s the set-theoretic union of two existing sets (i.e., an element
of the new set’s array is set to true if that element is true in either or both of the existing
sets—otherwise, the new set’s element is set to false). The static method intersection creates
a set which is the set-theoretic intersection of two existing sets (i.e., an element of the new
set’s array is set to false if that element is false in either or both of the existing sets—
otherwise, the new set’s element is set to true). Method insertElement inserts a new integer
k into a set (by setting a[k] to true). Method deleteElement deletes integer m (by setting a[m]
to false). Method toString returns a String containing a set as a list of numbers separated by
spaces. Include only those elements that are present in the set. Use --- to represent an empty
set. Method isEqualTo determines whether two sets are equal. Write a program to test class
IntegerSet. Instantiate several IntegerSet objects. Test that all your methods work properly.
*/

package src.test;

public class IntegerSet {
    private boolean[] set;

    public IntegerSet() {
        set = new boolean[101]; // set range is 0-100
    }

    public static IntegerSet union(IntegerSet set1, IntegerSet set2) {
        IntegerSet result = new IntegerSet();
        for (int i = 0; i <= 100; i++) {
            result.set[i] = set1.set[i] || set2.set[i];
        }
        return result;
    }

    public static IntegerSet intersection(IntegerSet set1, IntegerSet set2) {
        IntegerSet result = new IntegerSet();
        for (int i = 0; i <= 100; i++) {
            result.set[i] = set1.set[i] && set2.set[i];
        }
        return result;
    }

    public void insertElement(int k) {
        if (k >= 0 && k <= 100) {
            set[k] = true;
        }
    }

    public void deleteElement(int m) {
        if (m >= 0 && m <= 100) {
            set[m] = false;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        boolean isEmpty = true;
        for (int i = 0; i <= 100; i++) {
            if (set[i]) {
                sb.append(i).append(" ");
                isEmpty = false;
            }
        }
        if (isEmpty) {
            sb.append("---");
        }
        return sb.toString();
    }

    public boolean isEqualTo(IntegerSet other) {
        for (int i = 0; i <= 100; i++) {
            if (set[i] != other.set[i]) {
                return false;
            }
        }
        return true;
    }
}

class IntegerSetTest {
    public static void main(String[] args) {
        IntegerSet set1 = new IntegerSet();
        set1.insertElement(3);
        set1.insertElement(5);
        set1.insertElement(7);

        IntegerSet set2 = new IntegerSet();
        set2.insertElement(2);
        set2.insertElement(5);
        set2.insertElement(8);

        IntegerSet unionSet = IntegerSet.union(set1, set2);
        System.out.println("Union set: " + unionSet.toString()); // Output: Union set: 2 3 5 7 8

        IntegerSet intersectionSet = IntegerSet.intersection(set1, set2);
        System.out.println("Intersection set: " + intersectionSet.toString()); // Output: Intersection set: 5

        set1.deleteElement(5);
        System.out.println("Set1 after deleting element 5: " + set1);

        System.out.println(set1.isEqualTo(set2));
    }
}