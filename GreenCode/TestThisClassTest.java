
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import establishedClassHolder.TestThisClass;


import junit.framework.TestCase;

public class TestThisClassTest extends TestCase {
	
	
	
	  @Test
	    public void testOutput() {
	        TestThisClass tester = new TestThisClass(); // MyClass is tested
	        assertEquals(tester.output(), "THIS IS FROM THE CLASS BEING TESTING");
	       
	    }

}
