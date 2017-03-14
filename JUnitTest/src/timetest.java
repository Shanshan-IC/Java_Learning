/* This is time test */
import org.junit.*;


public class timetest {
	@Test(timeout = 1000)  
	public void infinity() {  
		while (true);  
	}  
	    
}
