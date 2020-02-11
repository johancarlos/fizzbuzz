package fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class fizzBuzzTest {
	
	@Test
    public void testFizzBuzz() {
		FizzBuzz fb = new FizzBuzz();
        assertEquals("FizzBuzz", fb.eval(15));
    }

    @Test
    public void testFizz() {
    	FizzBuzz fizz = new FizzBuzz();
        assertEquals("Fizz", fizz.eval(12));
    }

    @Test
    public void testBuzz() {
    	FizzBuzz buzz = new FizzBuzz();
        assertEquals("Buzz", buzz.eval(10));
    }

    @Test
    public void testNoFizzBuzz() {
    	FizzBuzz noFizzBuzz = new FizzBuzz();
        assertEquals("11", noFizzBuzz.eval(11));
    }

}
