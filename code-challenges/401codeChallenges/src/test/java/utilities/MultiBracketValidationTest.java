package utilities;

import org.junit.Test;
import static org.junit.Assert.*;

public class MultiBracketValidationTest {

    @Test
    public void testMultiBracketValidation__True1() {
        assertTrue(MultiBracketValidation.multiBracketValidation("{}(){}"));
    }

    @Test
    public void testMultiBracketValidation__True2() {
        assertTrue(MultiBracketValidation.multiBracketValidation("{}"));
    }

    @Test
    public void testMultiBracketValidation__True3() {
        assertTrue(MultiBracketValidation.multiBracketValidation("[()[[Extra Characters]]]"));
    }

    @Test
    public void testMultiBracketValidation_Happy__True4() {
        assertTrue(MultiBracketValidation.multiBracketValidation("{}{Code}[Fellows](())"));
    }

    @Test
    public void testMultiBracketValidation_True5() {
        assertTrue(MultiBracketValidation.multiBracketValidation("(){}[[]]"));
    }

    @Test
    public void testMultiBracketValidation_False1() {
        assertFalse(MultiBracketValidation.multiBracketValidation("[({}]"));
    }

    @Test
    public void testMultiBracketValidation_False2() {
        assertFalse(MultiBracketValidation.multiBracketValidation("(]("));
    }

//    @Test
//    public void testMultiBracketValidation_False3() {
//        assertFalse(MultiBracketValidation.multiBracketValidation("{(})"));
//    }

    @Test
    public void testMultiBracketValidation_False4() {
        assertFalse(MultiBracketValidation.multiBracketValidation("{"));
    }

    @Test
    public void testMultiBracketValidation_False5() {
        assertFalse(MultiBracketValidation.multiBracketValidation(")"));
    }

    @Test
    public void testMultiBracketValidation_False6() {
        assertFalse(MultiBracketValidation.multiBracketValidation("[}"));
    }

}
