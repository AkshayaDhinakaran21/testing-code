package webApplications;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.edge.EdgeDriver;

public class Nykaa {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.nykaa.com/");
		driver.findElement(By.xpath("//input[@placeholder='Search on Nykaa']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search on Nykaa']")).sendKeys("Garnier Men",Keys.ENTER);
		driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
		String text = driver.findElement(By.xpath("(//div[text()='Garnier Men Powerwhite Xl Charcoal Mask'])[1]")).getText();
		System.out.println("Product:" +text);
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		driver.switchTo().frame(0);
		String text2 = driver.findElement(By.xpath("//span[text()='Garnier Men Powerwhite Xl Charcoal Mask']")).getText();
        System.out.println("Product in Cart:"+text2);
        if(text.equals(text2)) {
        	System.out.println("Verified");
        }
        //driver.findElement(By.xpath("//i[@class='remove-product']")).click();
        driver.findElement(By.xpath("//div[@class='css-1l5d7z5 e1whhlt1']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Yes']")).click();
        String text3 = driver.findElement(By.xpath("//p[text()='Your Shopping Bag is Empty']")).getText();
        System.out.println("Product Removed:"+text3);
		driver.findElement(By.xpath("//div[@class='css-x6gbsc esabwed1']")).click();
	    
	}

}
