package webApplications;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class JalaSlider {
	public static void main(String[] args) {
        FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("http://magnus.jalatechnologies.com");
		driver.findElement(By.id("UserName")).sendKeys("training@jalaacademy.com");
		driver.findElement(By.id("Password")).sendKeys("jobprogram");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("(//span[@class='pull-right-container'])[2]")).click();
		try {
			driver.findElement(By.xpath("//a[text()=' Slider']")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String text = driver.findElement(By.id("ex6CurrentSliderValLabel")).getText();
		System.out.println("Current Value:"+text);
		WebElement ele = driver.findElement(By.xpath("(//div[@role='slider'])[1]"));
		Actions slide=new Actions(driver);
		slide.dragAndDropBy(ele,100,0).perform();
		String text2 = driver.findElement(By.id("ex6CurrentSliderValLabel")).getText();
		System.out.println("Moved:"+text2);
		driver.close();	
	}
}
