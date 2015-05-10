
public class Przekazywanie 
{
	public static void srednia(int... var)  // Procedura przyjmuje parametry w niewiadomej iloœci
	{
		double s = 0;
		for (int x : var)
		{
			s = s+x;
		}
		s = s/var.length;
		System.out.println("Œrednia wynosi :" + s);
	}

	public static void main(String[] args) 
	{
		srednia(23,34,655,23,1,32,4,54,6,33,2,1,3); // Wywyo³anie procedury
	}

}
