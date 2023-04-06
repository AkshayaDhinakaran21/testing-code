package dragAnddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class LeafGroung {
	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://leafground.com/drag.xhtml;jsessionid=node013e9sv8tr2brlthdpp6acv8c2192975.node0");
		WebElement ele = driver.findElement(By.xpath("//div[@id='form:drag_content']"));
		WebElement ele2 = driver.findElement(By.xpath("//div[@id='form:drop_content']"));
		Actions get=new Actions(driver);
		get.dragAndDrop(ele, ele2).perform();
		String cssValue = ele2.getCssValue("Background");
		System.out.println(cssValue);
		
		
	}

}
