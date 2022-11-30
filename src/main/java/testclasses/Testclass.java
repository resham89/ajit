package testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import pomclasses.Homepomclass;

public class Testclass extends Testbaseclass {

@Test
public void healthinsurance() throws InterruptedException {
	Homepomclass x=new Homepomclass(driver);
	x.life();
	x.quote();
	x.nope();
    x.next();
    
    String expect="https://www.lemonade.com/life/1?f=1";
   String actual=driver.getCurrentUrl();
   Assert.assertEquals(actual, expect);
    
    
//    x.firstname();
//    x.lastname();
//    x.letsdo();













}
}