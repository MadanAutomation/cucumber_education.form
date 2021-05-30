package Static;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Static 
{
	WebDriver driver;


	By Primary_School = By.xpath("//input[@placeholder='Primary School Name']");
	By Secondary_School = By.xpath("//input[@placeholder='Secondary School Name']");
	By Intermediate = By.xpath("//input[@placeholder='Intermediate College Name']");
	By Engineering = By.xpath("//input[@placeholder='Engineering College Name']");
	By University = By.xpath("//input[@placeholder='University Name']");
	By Intermediate_Percentage = By.xpath("//input[@placeholder='Intermediate Percentage']");
	By Gender = By.xpath("//input[@id='profession-0']");

	public Static(WebDriver driver) {
		 
		this.driver = driver;
	}

		//Parameterizing the void functions

	public void Primary_School(String primary_School) 

	{
		driver.findElement(Primary_School).sendKeys(primary_School);
	}

	public  void Secondary_School(String secondary_School) throws InterruptedException

	{
		driver.findElement(Secondary_School).sendKeys(secondary_School);


	}

	public  void Intermediate(String intermediate)

	{
	
		driver.findElement(Intermediate).sendKeys(intermediate);
   
		
	}
		public  void Engineering(String engineering) throws InterruptedException
		{
			
			driver.findElement(Engineering).sendKeys(engineering);
			   
			    }
		public  void University(String university) throws InterruptedException

		{
			driver.findElement(University).sendKeys(university);

			
		}			
    			
		public  void Intermediate_Percentage(String intermediate_Percentage) throws InterruptedException

		{
			driver.findElement(Intermediate_Percentage).sendKeys(intermediate_Percentage);

			
		}
		

		public  void Gender(String gender) throws InterruptedException

		{
			driver.findElement(Gender).click();


		}
	
}
