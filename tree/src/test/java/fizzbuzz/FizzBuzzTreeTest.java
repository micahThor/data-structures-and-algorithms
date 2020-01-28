package fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTreeTest  {

    FizzBuzzTree fizzBuzzTree;
    IntegerTree intTree;

    @Before
    public void init() {

        intTree = new IntegerTree();
        fizzBuzzTree = new FizzBuzzTree();

        intTree.add(40);
        intTree.add(3);
        intTree.add(22);
        intTree.add(30);
        intTree.add(43);
        intTree.add(53);
        intTree.add(69);

        fizzBuzzTree = fizzBuzzTree.integerToStringTreeify(intTree);
        fizzBuzzTree.fizzBuzzifyStringTree();

    }

    @Test
    public void test_FizzBuzzTree() {

        ArrayList<String> expected = new ArrayList<>();
        expected.add("22");
        expected.add("BUZZ");
        expected.add("FIZZBUZZ");
        expected.add("FIZZ");
        expected.add("43");
        expected.add("53");
        expected.add("BUZZ");

        ArrayList<String> actual = fizzBuzzTree.inOrder();

        for (int i = 0; i < actual.size(); i++) {
            assertEquals(expected.get(i), actual.get(i));
        }
    }

}
