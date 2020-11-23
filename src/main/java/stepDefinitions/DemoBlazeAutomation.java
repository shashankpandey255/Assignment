package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import DriverSetup.InstatntiateDriver;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DemoBlazeAutomation {
	String Total;
	InstatntiateDriver id = new InstatntiateDriver();
	WebDriver driver = id.setPath();

	@Given("^Customer navigates to the demoblaze website$")
	public void customer_navigates_to_the_demoblaze_website() throws Throwable {
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@Given("^Selects the Laptop Category$")
	public void selects_the_Laptop_Category() throws Throwable {
		driver.findElement(By.xpath("//a[text()='Laptops']")).click();
		Thread.sleep(2000);
	}

	@When("^Customer Clicks the Sony Vaio$")
	public void customer_Clicks_the_Sony_Vaio() throws Throwable {
		driver.findElement(By.xpath("//a[text()='Sony vaio i5']")).click();
		Thread.sleep(2000);
	}

	@Then("^Clicks the Home$")
	public void accepts_the_Alert() throws InterruptedException {
		
		driver.findElement(By.xpath("//a[text()='Home ']")).click();
		
		Thread.sleep(2000);
	}

	@When("^Adds to the Cart and Accepts the Alert$")
	public void adds_to_the_Cart() throws Throwable {
		driver.findElement(By.xpath("//a[text()='Add to cart']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
	}

	@Then("^Accept the pop up confirmation$")
	public void accept_the_pop_up_confirmation() throws Throwable {

	}

	@When("^Customer Clicks the Dell$")
	public void customer_Clicks_the_Dell() throws Throwable {
		driver.findElement(By.xpath("//a[text()='Dell i7 8gb']")).click();
		Thread.sleep(2000);

	}

	@When("^User Naviagtes to Cart and deletes the Dell Laptop$")
	public void user_Naviagtes_to_Cart_and_deletes_the_Dell_Laptop() throws Throwable {
		driver.findElement(By.xpath("//a[text()='Cart']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//tr/td[2][text()='Dell i7 8gb']/following-sibling::td[2]/a")).click();
		Thread.sleep(5000);
		Total=driver.findElement(By.id("totalp")).getText();
	}

	@Then("^User Places the Order and fills the form$")
	public void user_Places_the_Order_and_fills_the_form() throws Throwable {
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("ABC");
		driver.findElement(By.id("country")).sendKeys("India");
		driver.findElement(By.id("city")).sendKeys("Mumbai");
		driver.findElement(By.id("card")).sendKeys("12345678923456789");
		driver.findElement(By.id("month")).sendKeys("May");
		driver.findElement(By.id("year")).sendKeys("2022");
		Thread.sleep(2000);
	}

	@When("^User clicks the Purchase button$")
	public void user_clicks_the_Purchase_button() throws Throwable {
		driver.findElement(By.xpath("//button[text()='Purchase']")).click();
		Thread.sleep(2000);
	}

	@Then("^Verify the Amount and capture the Purchase ID$")
	public void verify_the_Amount_and_capture_the_Purchase_ID() throws Throwable {
		String str=driver.findElement(By.xpath("//p[@class='lead text-muted ']")).getText();
		System.out.println("ID= "+str.substring(4, 11));
		String amt=str.substring(20, 23);
		System.out.println(Total);
		System.out.println(amt);
		if(Total.equalsIgnoreCase(amt)) {
			System.out.println("Amount equals expected");
		}
		driver.findElement(By.xpath("//button[@class='confirm btn btn-lg btn-primary']")).click();
	}
	
	
}
