package alert;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Alert2 {
	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://leafground.com/alert.xhtml");
		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		driver.switchTo().alert().sendKeys("DHARUN");
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
	}

}
