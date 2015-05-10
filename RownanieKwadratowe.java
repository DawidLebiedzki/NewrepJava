public class RownanieKwadratowe {

	private int a, b, c; // Zmienne prywatne do r�wnania
	

	public RownanieKwadratowe(int a, int b, int c) 
	{
		this.a = a;
		this.b = b;
		this.c = c;

	}

	public String Rozwiaz() 
	{
		String rozwiazanie = ""; 
		double delta;
		delta = (b * b - 4 * a * c);
		if (delta > 0) {
			delta = Math.sqrt(delta);
			double x1 = (-b - delta) / (2 * a);
			double x2 = (-b + delta) / (2 * a);
			rozwiazanie = "R�wnanie posiada dwa pierwisatki rzeczywiste: "+ x1+" "+ x2;
		} else if (delta == 0) {
			delta = Math.sqrt(delta);
			double x0 = -b / (2 * a);
			rozwiazanie = "R�wnanie posiada jeden pierwisatek rzeczywisty: "+ x0;
		} else {
			rozwiazanie = "Brak pierwiastk�w rzeczywistych";
		}
		return rozwiazanie;
	}

	public String toString()
	{
		return "R�wnanie kwadratowe: " + a + "x^2 +" + b + "x + " + c;
	}
	public static void main(String[] args) 
	{
		RownanieKwadratowe rownanie = new RownanieKwadratowe(5, 3, -4);
		System.out.println(rownanie.Rozwiaz());

	}

}
