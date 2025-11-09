package lab1;
public class First {
	public static void main(String[] args) {
		String x="Samanya 170?";
		int CapC=0, Smallc=0,Intc=0,SpaC=0;
		for (int i=0;i<x.length();i++) {
			if(x.charAt(i)>=65 && x.charAt(i)<=90)
			{
				CapC++;
			}
			else if(x.charAt(i)>=48 && x.charAt(i)<=57)
			{
				Intc++;
			}
			else if(x.charAt(i)>=97 && x.charAt(i)<=122)
			{
				Smallc++;
			}
			else if(x.charAt(i)==32)
			{
				SpaC++;
			}
			else
				System.out.println("special character");
		}
		System.out.println("Capital count:"+CapC);
		System.out.println("Small count:"+Smallc);
		System.out.println("numbers count:"+Intc);
		System.out.println("Space count:"+SpaC);
	}
}
