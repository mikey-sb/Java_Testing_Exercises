import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTests {
    Printer printer;

    @Before
    public void before() {
        printer = new Printer(100, 50);
    }

    @Test
    public void sheetsRemaining() {
        assertEquals(100, printer.getSheetsRemaining());
    }

    @Test
    public void pagesReduceOnPrint() {
        printer.print(2, 10);
        assertEquals(80, printer.getSheetsRemaining());
    }

    @Test
    public void printerDoesNotHaveEnoughPages() {
        printer.print(50, 3);
        assertEquals(100, printer.getSheetsRemaining());
    }

    @Test
    public void printerHasToner() {
        assertEquals(50, printer.getToner());
    }

    @Test
    public void printerUsesToner() {
        printer.print(2, 3);
        assertEquals(44, printer.getToner());
    }


}
