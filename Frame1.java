package frame;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Frame1 {
	public static void main(String[] args) throws IOException {
		EdgeDriver driver=new EdgeDriver();
		//ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://leafground.com/frame.xhtml;jsessionid=node03zuxct0a9n7mrag3ghh2jdvm155768.node0");
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click")).click();
		WebElement ele = driver.findElement(By.id("Click"));
		File start=ele.getScreenshotAs(OutputType.FILE);
		File end=new File("./snap/004.jpg");
		FileUtils.copyFile(start, end);
	}
}
