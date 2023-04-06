package snap;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.edge.EdgeDriver;

public class Snap4 {
	public static void main(String[] args) throws IOException {
		EdgeDriver driver=new EdgeDriver();
		//ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.facebook.com/");
		File start = driver.getScreenshotAs(OutputType.FILE);
		File end=new File("./snap/005.jpg");
		FileUtils.copyFile(start, end);
	}

}
