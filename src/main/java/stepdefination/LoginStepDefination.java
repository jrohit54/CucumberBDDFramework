package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefination {
	
	WebDriver driver;
	
	@Given("^User is already on login_page$")
	public void user_already_on_login_page()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\rohit\\localWorkspace\\FreeCRMBDDFramework\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
	}

	@When("^Title of login_page  is FreeCRM$")
	public void title_of_login_page_isfree_CRM()
	{
		String title=driver.getTitle();
		Assert.assertEquals("Free CRM software in the cloud powers sales and customer service", title);
		
	}
	
	@Then("^user enters user_name and password$")
	public void user_enters_username_and_password()
	{
		driver.findElement(By.name("username")).sendKeys("jrohit54");
		driver.findElement(By.name("password")).sendKeys("123456");
	}
	
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}
	@Then("^user is on home page$")
	public void user_is_on_home_page()
	{
		String title=driver.getTitle();
		Assert.assertEquals("CRMPRO", title);
	}
	
}
