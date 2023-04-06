package webApplications;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {
	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.snapdeal.com/");
		WebElement ele = driver.findElement(By.xpath("(//span[@class='catText'])[1]"));
		Actions get=new Actions(driver);
		get.pause(20).moveToElement(ele).perform();
		driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();
				}
}
