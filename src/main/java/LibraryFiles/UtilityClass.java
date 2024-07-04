package LibraryFiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass
{

	public static String getTD(int rowIndex, int colIndex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\TestData\\exel file.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet5");
		
		String value=sh.getRow(rowIndex).getCell(colIndex).getStringCellValue();
		return value;
	}
	
	public static void getFailedTCesSS(WebDriver driver,int TCID) throws IOException
	{
	 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 File dest=new File(System.getProperty("user.dir")+"\\FailedTestCasesScreenShots\\Test_Case"+TCID+".jpg");
	 FileHandler.copy(src, dest);
	}
	
	public static String getPFdata(String key) throws IOException
	{
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\PropertyFile.properties");
		Properties pf=new Properties();
		pf.load(file);
		String value = pf.getProperty(key);
		return value;
	}
	
}
