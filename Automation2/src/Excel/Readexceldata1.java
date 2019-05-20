package Excel;

import lib.Exceldataconfig5;

public class Readexceldata1 
{
	public static void main(String[] args)
	{
		Exceldataconfig5 Excel= new Exceldataconfig5("F:\\Testdata\\userdata5.xlsx");
		System.out.println(Excel.getdata(0, 1, 0));	
		
	}

}
