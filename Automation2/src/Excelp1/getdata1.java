package Excelp1;

public class getdata1 
{
	public static void main(String[]args)
	{
		Exceldataconfig1 data=new Exceldataconfig1("F:\\Testdata\\ud1.xlsx");
		System.out.println(data.getdata(1, 1, 1));
		System.out.println(data.getdata(0, 0, 1));
		
	}

}
