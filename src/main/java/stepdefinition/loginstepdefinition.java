package stepdefinition;
import java.util.List;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.sun.jna.platform.win32.WinUser.HARDWAREINPUT;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class loginstepdefinition {
	@Before
	public void setup()
	{
		System.out.print("kk");
	}
	
	@After
	public void quit()
	{
		System.out.print("yoyoyoyo");
	}
	
	WebDriver driver;
	@Given("^USER ON LOGIN PAGE$")
	public void user_ON_LOGIN_PAGE() {
		String exePath = "C:/Users/swati.singh/Downloads/driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
	    driver= new ChromeDriver();
		 driver.get("https://www.freecrm.com/index.html");
	   // driver.get("https://www.google.com");
		 driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}

	@When("^ENTER \"([^\"]*)\" AND \"([^\"]*)\"$")
	public void enter_AND(String username, String password) throws Throwable {
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
			 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		
		WebElement loginBtn =
					 driver.findElement(By.xpath("//input[@type='submit']"));
					 JavascriptExecutor js = (JavascriptExecutor)driver;
				        js.executeScript("arguments[0].click();", loginBtn);
	}
	
	
	
	@Then("^ON HOME PAGE$")
	public void on_HOME_PAGE() {
		 String title = driver.getTitle();
		 System.out.println("Home Page title ::"+ title);
		 Assert.assertEquals("CRMPRO", title);
	}

	@Then("^user moves to contact page$")
	public void user_moves_to_contact_page(){
	   driver.switchTo().frame("mainpanel");
	   Actions action= new Actions(driver);
	   action.moveToElement(driver.findElement(By.xpath("//a[contains(.,'Contacts')]"))).build().perform();
	   driver.findElement(By.xpath("//a[contains(.,'New Contact')]")).click();
	   
	}
	@When("^ENTER username AND password$")
	public void enter_username_AND_password(DataTable credentials) throws Throwable {
		List<List<String>> data= credentials.raw();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(data.get(0).get(0));
		 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(data.get(0).get(1));
	
	WebElement loginBtn =
				 driver.findElement(By.xpath("//input[@type='submit']"));
				 JavascriptExecutor js = (JavascriptExecutor)driver;
			        js.executeScript("arguments[0].click();", loginBtn);
	    
	}

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and_and(String firstname, String lastname, String position) {
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(firstname);
		 driver.findElement(By.xpath("//input[@name='surname']")).sendKeys(lastname);
		 driver.findElement(By.xpath("//input[@name='company_position']")).sendKeys(position);
	
	WebElement loginBtn1 =
				 driver.findElement(By.xpath("//input[@type='submit']"));
				 JavascriptExecutor js = (JavascriptExecutor)driver;
				 js.executeScript("arguments[0].click();", loginBtn1);
	}

	@Then("^browser is closed$")
	public void browser_is_closed() throws Throwable {
	   driver.quit();
	}


}
