package Final;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculationTest {

	public class FunctionsTest {
	    @Test
	    public void test() throws  Exception{
	        Calculation calculation = new  Calculation();
	       Cadency kadencja1 = new ParserJson().deputyParse(7);
	        

	      
	        assertEquals(": 272247.607894737", calculation.avarageSum(kadencja1));
	        assertEquals(": Adam Szejnfeld", calculation.mostTravel(kadencja1 ));
	        assertEquals(": Adam Szejnfeld", calculation.theMostExpensiveTrip(kadencja1));
	        
	      

	    }

}
}
