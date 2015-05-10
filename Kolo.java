
public class Kolo {
	
	
	private double promien;					// Zmienne typu double
	
	public Kolo()							// Konstruktor obiektow z ustawionym juz parametrem
	{
		promien = 1.0;
	}
	
	public Kolo(double r)					// Konstruktor przyjmuj¹cy parametr (przeci¹¿enie)
	{
		promien = r;
	}
	
	public Kolo(double r, String j)
	{
		promien = r;
		if(j.equals("km"))
		{
			promien = promien*1000;
		}
	}
	
	public void setPromien(double r)		// Metoda ustawia wartoœæ zmiennej promien "METODA MUTATORA"
	{
		promien = r; 
	}
	
	public double getPromien()				// Metoda AKCESORA
	{
		return promien;
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
		
		Kolo kolo = new Kolo(3.5);				// Nowe obiekty w klasie Kolo
		Kolo kolko = new Kolo(2,"km");
		//kolo.setPromien(1.0);
		
		//Wyœwietla dane na ekranie
		System.out.println("Promien ko³a wynosi " + kolo.getPromien());
		System.out.println("Obwód ko³a wynosi " + kolo.obliczObwodKola());
		System.out.println("Pole ko³a wynosi " + kolo.obliczPoleKola());
		
		System.out.println("Promien kó³ka wynosi " + kolko.getPromien());
		System.out.println("Obwód kó³ka wynosi " + kolko.obliczPoleKola());
		System.out.println("Pole kó³ka wynosi " + kolko.obliczPoleKola());
		
		
	}

}
