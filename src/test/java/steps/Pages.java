package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Static.Static;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Pages  
{
	WebDriver driver;
	
	@Given("First start page")
	
	public void i_am_on_start_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://testzenlabs.ie/education-form/");
		
		
	}

	@Given("I enter the name a Primary_School {string}")
	public void i_enter_the_name_a_Primary_School(String primary_School) throws InterruptedException {
		Static login = new Static(driver);
		login.Primary_School(primary_School);
		
	}

	@Given("I enter the name a Secondary_School {string}")
	public void i_enter_the_name_a_Secondary_School(String secondary_School) throws InterruptedException{
		Static login = new Static(driver);
		login.Secondary_School(secondary_School);
		
	}

	@Given("I enter the name a Intermediate {string}")
	public void i_enter_the_name_a_Intermediate(String intermediate) throws InterruptedException {
		Static login = new Static(driver);
		
		login.Intermediate(intermediate);
		
	}

	@When("I enter the name a Engineering {string}")
	public void i_enter_the_name_a_Engineering(String engineering) throws InterruptedException {
		Static login = new Static(driver);
		login.Engineering(engineering);
		
	}

	@When("I enter the name a University {string}")
	public void i_enter_the_name_a_University(String university) throws InterruptedException {
		
		Static login = new Static(driver);
		login.University(university);
		
	}

	@When("I enter the intermediate_Percentage {string}")
	public void i_enter_the_intermediate_Percentage(String intermediate_Percentage) throws InterruptedException {
		
		Static login = new Static(driver);
		login.Intermediate_Percentage(intermediate_Percentage);
	}	
	@When("I click on gender {string}")
	public void i_click_on_gender(String gender) throws InterruptedException {
		Static login = new Static(driver);
		login.Gender(gender);
	}

	@When("browser quit")
	public void browser() throws InterruptedException {
		
		driver.quit();
	
	}


}
