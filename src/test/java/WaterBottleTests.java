import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTests {
    WaterBottle waterBottle;

    @Before
    public void before() {waterBottle = new WaterBottle(100);}

    @Test
    public void hasStartingVolumeOfOneHundred(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void drinkShouldTakeTen(){
        waterBottle.takeDrink();
        assertEquals(90, waterBottle.getVolume());
    }

    @Test
    public void emptyShouldEmpty(){
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void fillShouldFill(){
        waterBottle.empty();
        waterBottle.fill();
        assertEquals(100, waterBottle.getVolume());
    }
}
