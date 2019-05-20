package Excel;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XSSF 
{
	public static void main(String[] args) throws Exception 
	{
		File f1=new File("F:\\Testdata\\userdata6.xlsx");
		FileInputStream fis=new FileInputStream(f1);
		XSSFWorkbook w1=new XSSFWorkbook(fis);
		XSSFSheet s1=w1.getSheetAt(0);
		String data=s1.getRow(0).getCell(1).getStringCellValue();
		System.out.println("Excel data "+data);
	    w1.close();
	}

}
