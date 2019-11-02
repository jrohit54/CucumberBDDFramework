package stepdefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginStepDefination {
	
	WebDriver driver;
	
	@Given("^User is already on login_page$")
	public void user_already_on_login_page()
	{
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://www.freecrm.com/index.html");
	}

	@When("^Title of login_page  is FreeCRM$")
	public void title_of_login_page_isfree_CRM()
	{
		String title=driver.getTitle();
		System.out.println("==="+driver.getTitle());
		Assert.assertEquals("Free CRM #1 cloud software for any business large or small", title);
		
	}
	@Then("^user click on login button$")
	public void click_login_button()
	{
		driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
		
	}
	
	@Then("^user click on classic CRM link$")
	public void click_classic_CRM_link()
	{
		driver.findElement(By.xpath("//a[contains(text(),'Classic CRM')]")).click();
		
	}
	
	@Then("^user enters user_name and password$")
	public void user_enters_username_and_password() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@placeholder='Login']")).sendKeys("jrohit54");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("123456");
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
