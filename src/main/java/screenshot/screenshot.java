package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {
public ChromeDriver driver;
	
	public void capture(String SnapName) throws IOException
	{
		File Source1 = driver.getScreenshotAs(OutputType.FILE);
		File Destination2 = new File("./Snaps/"+SnapName+".png");
		FileUtils.copyFile(Source1, Destination2);
		
	}


}
