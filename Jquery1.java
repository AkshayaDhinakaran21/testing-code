package dragAnddrop;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Jquery1 {
	public static void main(String[] args) throws IOException  {
		EdgeDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://jqueryui.com/draggable/");
		File dest = driver.getScreenshotAs(OutputType.FILE);
		File set=new File("./snap/009.jpg");
		FileUtils.copyFile(dest,set);
		driver.switchTo().frame(0);
		WebElement element = driver.findElement(By.id("draggable"));
		Actions get=new Actions(driver);
		get.dragAndDropBy(element, 100,100).perform();
		File start = driver.getScreenshotAs(OutputType.FILE);
		File end=new File("./snap/010.jpg");
		FileUtils.copyFile(start, end);
		
		}
}
