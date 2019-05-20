package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XSSF3 
{
	public static void main(String[] args) throws Exception
	{
		File f1= new File("F:\\Testdata\\userdata03.xlsx");
		FileInputStream fis=new FileInputStream(f1);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet s1=wb.getSheetAt(2);
	s1.createRow(4).createCell(2).setCellValue("Hi Big cheeks nadinioooooooo");
	FileOutputStream fout=new FileOutputStream(f1);
		wb.write(fout);
		wb.close();
		
	}

}
