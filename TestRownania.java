import java.util.Scanner;

public class TestRownania 
{

	public static void main(String[] args)
	{
		System.out.println("Podaj prametry a, b i c :");
		Scanner skaner = new Scanner(System.in);
		int a = skaner.nextInt();
		int b = skaner.nextInt();
		int c = skaner.nextInt();
		
		RownanieKwadratowe r = new RownanieKwadratowe(a, b, c);
		System.out.println(r.Rozwiaz());
		System.out.println(r);
		
	}

}
