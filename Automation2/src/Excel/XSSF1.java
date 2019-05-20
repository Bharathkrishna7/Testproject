package Excel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XSSF1 
{
	public static void main(String[] args) throws Exception
	{
		File f1=new File("F:\\Testdata\\userdata01.xlsx");
		FileInputStream fis=new FileInputStream(f1);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet s1=wb.getSheetAt(0);
		String data=s1.getRow(1).getCell(2).getStringCellValue();
		System.out.println("data in excel is "+data);
		wb.close();
		
	}

}
