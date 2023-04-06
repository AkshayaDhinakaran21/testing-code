package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Frame3 {
	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		//ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://leafground.com/frame.xhtml;jsessionid=node03zuxct0a9n7mrag3ghh2jdvm155768.node0");
		//driver.switchTo().frame(0);
		//driver.findElement(By.id("Click")).click();
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click")).click();
	}

}
