import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BeerTests {

    Beer beer;
    Beer beer2;

    @Before
    public void before() {
        beer = new Beer("Joker IPA", 25);
        beer2 = new Beer("Caesar Augustus", 50);
    }

    @Test
    public void jokerHasName(){
        assertEquals("Joker IPA", beer.getBeerName());
    }

    @Test
    public void caesarHasName(){
        assertEquals("Caesar Augustus", beer2.getBeerName());
    }

}
