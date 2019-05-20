package Excel;

import lib.Exceldataconfig;

public class ReadExceldata
{
	public static void main(String[] args) 
	{
		Exceldataconfig excel=new Exceldataconfig("F:\\Testdata\\userdata5.xlsx");
		System.out.println(excel.getdata(0, 5, 0));
	}
}
