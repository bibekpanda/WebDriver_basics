package com.test;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SauceLabsHomePageTest {
	
	private WebDriver browser;
	
	
	@Given("I open a browser")
	public void ChromePath() {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver_win32\\chromedriver.exe");  
		browser = new ChromeDriver();
		
	}
	
	@When ("Initiate Page")
	public void link () {
     browser.get("http://15.114.95.152:4004/dashboard/");  
	}
	@Then("Login screen is displayed")
	public void login () {
		   browser.findElement(By.xpath("//input[@id='user']")).sendKeys("admin");
	       browser.findElement(By.xpath("//input[@id='password']")).click();
	       browser.findElement(By.xpath("//input[@id='password']")).sendKeys("Da$hb0ard!");
	       browser.findElement(By.id("submit_login")).click();
		
	}
	

}
