package Excel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MukeshXSSF2
{
	public static void main(String[] args) throws Exception 
	{
		File f1=new File("F:\\Testdata\\Test Case review.xlsx");
		FileInputStream fis=new FileInputStream(f1);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(1);
		int rowcount=sheet1.getLastRowNum();
		System.out.println("total num of row "+rowcount);
		for(int i=0;i<=rowcount;i++)
		{
			String data=sheet1.getRow(i).getCell(1).getStringCellValue();
			System.out.println("data in the excel sheet "+data);
		
		}
			wb.close(); 
		}

}
