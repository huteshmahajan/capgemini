import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SampleTest {
	
	
@Test
public void sampleTestPass() {
	int a =1;
	int b=2;
	assertTrue(a+b==3);
	
}
@Test
public void sampleTestFail() {
	int a =2;
	int b=2;
	assertTrue(a+b==4);
	
}

}
