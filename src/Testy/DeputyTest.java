package Final;

import static org.junit.Assert.*;

import org.junit.Test;

public class DeputyTest {

	
	   Calculation functions = new Calculation();
    Cadency kadencja1 = new ParserJson().deputyParse(7);
    Deputy deputy=kadencja1.getDeputies().get(1);

    public DeputyTest() throws Exception {
    }

    @Test
    public void getId() throws Exception {
        assertEquals("174", deputy.getId().toString());

    }

    @Test
    public void getFirstName() throws Exception {
        assertEquals(kadencja1.getDeputies().get(1).getData().getFirstName(), deputy.getFirstName());


    }

    @Test
    public void getLastName() throws Exception {
        assertEquals(kadencja1.getDeputies().get(1).getData().getLastName(), deputy.getLastName());

    }

    @Test
    public void getDeputySum() throws Exception {
        assertTrue(deputy.getDeputySum()==277061.64);

    }

}
