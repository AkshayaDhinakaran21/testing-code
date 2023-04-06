package window;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.edge.EdgeDriver;

public class Window {
	public static void main(String[] args) throws IOException {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://leafground.com/window.xhtml;jsessionid=node01c8xkxeqifcmk1dn0xk5lqwoan192286.node0");
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		Set<String> open = driver.getWindowHandles();
		List<String> end=new ArrayList<String>(open);
		driver.switchTo().window(end.get(1));
		File start = driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("./snap/008.jpg");
		FileUtils.copyFile(start, dest);
		driver.close();
	}

}
