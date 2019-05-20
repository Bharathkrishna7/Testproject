package Excel;

import lib.Exceldataconfig2;

public class Readexcel2
{
	public static void main(String[] args)
	{
		Exceldataconfig2 Excel=new Exceldataconfig2("F:\\Testdata\\userdata04.xlsx");
			System.out.println(Excel.getdata(0, 1, 1));
	}

}
