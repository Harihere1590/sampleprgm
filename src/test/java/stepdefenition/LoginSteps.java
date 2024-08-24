package stepdefenition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	WebDriver driver = null; 
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("Inside step-user is on login page");
		System.setProperty("Webdriver.chrome.driver","C:/Users/mesam/eclipse-workspace/Facebook/src/test/resources/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http:/facebook.com");
		
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() throws InterruptedException {
		System.out.println("Inside step-user enters username and password");
		
		driver.findElement(By.name("email")).click();
	
		driver.findElement(By.name("email")).sendKeys("hariprasathhere@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("hari123");
		
	}

	@And("user click login button")
	public void user_click_login_button() {
		System.out.println("Inside step-user clicks login button");
		driver.findElement(By.name("login")).click();
		
		
	}

	@Then("user getting incorrect password text")
	public void user_getting_incorrect_password_text() {
		System.out.println("Inside user_getting_incorrect_password_text");
		System.out.println(driver.findElement(By.className("_9ay7")).getText());
		driver.quit();
		
	}

}
