package lab1;
public class Second {
	public static void main(String[] args) {
		dis(0);
	}
	public static void dis(int n) {
		if(n==10)
			return;
		else
		{
			System.out.println("Thanvi-->Happy Birthaday🎀 "+n);
			dis(++n);
		}
	}
}
