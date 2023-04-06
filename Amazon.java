package webApplications;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon {
	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Headphones");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
	}


}
