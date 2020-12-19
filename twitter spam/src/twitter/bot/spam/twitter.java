package twitter.bot.spam;

import org.openqa.selenium.By;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class twitter {

	public static void main(String[]args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.gecko.driver","/home/yistech/Selenium_Setup/geckodriver");
		  WebDriver driver = new FirefoxDriver();
		  Robot bot = new Robot();
		  driver.get("https://twitter.com/MacRumors");
		  Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div[1]/a")).click();
		
		String usr = "theRealYISTECH";
		WebElement username = driver.findElement(By.name("session[username_or_email]"));
		username.sendKeys(usr);
		
		String pwd = "8scat88338o6jY";
		
          driver.findElement(By.name("session[password]")).sendKeys(pwd);
            driver.findElement(By.xpath("/html/body/div/div/div/div[2]/main/div/div/div[1]/form/div/div[3]/div/div")).click();
            
	
	   Thread.sleep(200);
	WebElement mess = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/main/div/div/div/div[1]/div/div[2]/div/div/div[1]/div/div[1]/div/div[2]/div"));
    mess.click();
	
	
	}
	
	
	
	
	
}
