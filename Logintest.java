package Package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Logintest {
	 WebDriver driver;
	@Given("^user present in adactin login page$")
	public void openlogin() throws Exception {
		driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
		driver.manage().window().maximize();
	}
	@When("^user enter user name$")
	public void enterunpwd() {
		driver.findElement(By.name("username")).sendKeys("mansoor8");
	}
	@And("^user enter password$")
	public void enterpwd() {
		driver.findElement(By.id("password")).sendKeys("mansoor");
	}
	@And("^user click on login button$")
	public void clicklogin() {
		driver.findElement(By.className("login_button")).click();
	}
	@Then("^user navigate to login page$")
	public void home() {
		driver.close();
	}

}
