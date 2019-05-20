package Excel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Suneelreadexcel 
{
	public static void main(String args[]) throws Exception
	{
		File f1=new File("F:/Testdata/userdata4.xlsx");
		FileInputStream fis=new FileInputStream(f1);
		Workbook w1=WorkbookFactory.create(fis);
	   Sheet s1=w1.getSheetAt(0);
	   int rowcount=s1.getLastRowNum();
	   System.out.println("total row"+rowcount+1);
	   for(int i=0;i<=rowcount;i++)
	   {
		  String data0=s1.getRow(i).getCell(1).getStringCellValue();
		   System.out.println("Testdata from excel is"+data0);
		   
	   }
		
	}

}
