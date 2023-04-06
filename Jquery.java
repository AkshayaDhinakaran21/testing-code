package dragAnddrop;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Jquery {
	public static void main(String[] args)  {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://jqueryui.com/droppable/");
	    driver.switchTo().frame(0);
		WebElement ele = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement ele2 = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions get=new Actions(driver);
		get.dragAndDrop(ele, ele2).perform();
		
		
		
		
		
}

}
