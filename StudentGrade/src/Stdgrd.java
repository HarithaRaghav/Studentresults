
public class Stdgrd {
	public static void main (String args[])
	{
		int sci,mat,soc,eng,tel,hin;
		int tot,avg;
		sci = 80;
		mat = 98;
		eng = 65;
		tel = 70;
		hin = 55;
		
		tot = sci+mat+eng+tel+hin;
		avg = tot/6;
		
		if(avg >= 70 && avg < 100)
			System.out.println("Distinction");
		else if(avg >=60 && avg < 70)
			System.out.println("First class");
		else if(avg >= 50 && avg < 60)
			System.out.println("Second class");
		else if(avg >= 35 && avg < 50)
			System.out.println("Third class");
		else
			System.out.println("Fail");
		
	}

}
