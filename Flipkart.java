package webApplications;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Flipkart {
	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.flipkart.com/");
	    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	    driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Redmi 9 prime");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    driver.findElement(By.xpath("//div[text()='REDMI 9 Prime (Matte Black, 64 GB)']")).click();
	    Set<String> handles = driver.getWindowHandles();
	    List<String> get=new ArrayList<String>(handles);
	    driver.switchTo().window(get.get(1));
		driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
		System.out.println("Product in cart:"+driver.getTitle());
       //String get="REDMI 9 Prime ( 64 GB Storage, 4 GB RAM ) Online at Best Price On Flipkart.com";
   
		}

}
