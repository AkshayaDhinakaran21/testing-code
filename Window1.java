package window;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class Window1 {
	 public static void main(String[] args) {
		   ChromeOptions option=new ChromeOptions();
		   option.addArguments("-disable-notifications");
		   EdgeDriver driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			driver.get("https://www.irctc.co.in/nget/train-search");
			String title = driver.getTitle();
			System.out.println("Parent:"+driver.getTitle());
			driver.findElement(By.linkText("FLIGHTS")).click();
	
			Set<String> open = driver.getWindowHandles();
			List<String> child=new ArrayList<String>(open);
			driver.switchTo().window(child.get(1));
			System.out.println("Child:"+driver.getTitle());
			String title2 = driver.getTitle();
			if(title != title2) {
				System.out.println("Title Miss Match Hence its verified");
			}
		
			

	 }
}
