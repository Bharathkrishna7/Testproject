package Excelp1;

public class getdata 
{
  public static void main(String[]args)
  {
	  Exceldataconfig data=new Exceldataconfig("F:\\Testdata\\userdata5.xlsx");
	  System.out.println(data.getdata(0, 0, 0));
  }

}
