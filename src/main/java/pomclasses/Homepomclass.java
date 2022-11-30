package pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Homepomclass {

WebDriver driver;


@FindBy(xpath="(//a[@data-event='menu_life_clicked'])[1]")
WebElement life;
public void life()
{
	life.click();
}

@FindBy(xpath="//a[text()='Get a quote']")
WebElement quote;
public void quote()
{
quote.click();
}

@FindBy(xpath="(//div[@class='option-inner'])[2]")
WebElement nope;
public void nope()
{
	nope.click();
}



@FindBy(xpath="//button[@type='submit']")
WebElement next;
public void next()
{
	next.click();
}




@FindBy(xpath="//input[@class='input-text first_name is-empty']")
WebElement firstname;
public void firstname()
{

	firstname.sendKeys("prajkta");;
}


@FindBy(xpath="//input[@class='input-text last_name is-empty']")
WebElement lastname;
public void lastname()
{

	firstname.sendKeys("mane");;
}


@FindBy(xpath="//button[@form='questions_form']")
WebElement letsdo;
public void letsdo()
{

	letsdo.click();;
}







public Homepomclass(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}



}
