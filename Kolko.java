
public class Kolko {
	
	// Tylko taka zmiana dla gita
	private double promien;					// Zmienne typu double
	private int id;
	private static int nextId;
	
	public Kolko()							// Konstruktor obiektow z ustawionym juz parametrem
	{
		this(1.0);
	}
	
	public Kolko(double r)					// Konstruktor przyjmuj�cy parametr (przeci��enie)
	{
		this(r, "cos");
	}
	
	public Kolko(double r, String j)
	{
		id = nextId;
		nextId++;
		promien = r;
		if(j.equals("km"))
		{
			promien = promien*1000;
		}
	}
	 
	
	public void setPromien(double r)		// Metoda ustawia warto�� zmiennej promien "METODA MUTATORA"
	{
		promien = r; 
	}
	
	public double getPromien()				// Metoda AKCESORA
	{
		return promien;
	}
	
	public int getId()
	{
		return id;
	}
	
	public double obliczObwodKola()			// Metoda oblicza obwod kola
	{
		return 2*Math.PI*promien;
	}
	
	
	public double obliczPoleKola()			// Metoda oblicza pole kola
	{
		double pole;
		pole = Math.PI*promien*promien;
		return pole;
	}
	
	public static void main(String[] args)
	{
		
		Kolko[] kolka = new Kolko[3];
		kolka[0] = new Kolko();
		kolka[1] = new Kolko(3);
		kolka[2] = new Kolko(4, "km");
		
		//Wy�wietla dane na ekranie
		for (Kolko x:kolka)
		{	
			System.out.println("Id ko�a wynosi " + x.getId());
			System.out.println("Promien ko�a wynosi " + x.getPromien());
			System.out.println("Obw�d ko�a wynosi " + x.obliczObwodKola());
			System.out.println("Pole ko�a wynosi " + x.obliczPoleKola());
			System.out.println();
		}
		

		
	}

	static
	{
		nextId = 1;
	}
}
