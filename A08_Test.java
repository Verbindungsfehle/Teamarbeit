package a08;

/**
 * 
 * @author Ulrich Fr�hst�ck
 * @description Eine Klasse, die die Main-Methode des Programms 
 * enth�llt und s�mtliche Methoden der Utility-Klasse aufruft und 
 * testet.
 * @version 10/11/16
 */

public class A08_Test {
	
	/**
	 * Die Main-Methode des Programms, in dem s�mtliche Methoden
	 * der Zahlen, Fl�che und Rauminhalte-Klasse aufgerufen und somit getestet werden.
	 * @param args ein String Array als Parameter (args= Arguments), damit man 
	 * beim Start des Programms Argumente �bergeben kann,
	 * wird allerdings f�r diese Aufgabe nicht verwendet. 
	 */
	public static void main(String[] args) {
		/* Testen der Methoden der Fl�che-Klasse */
		Flaeche f = new Flaeche(3, 4, 5); //erzeugen einer neuen Fl�che
		System.out.printf("Testen der Fl�chen-Methoden\n"); //"Header"
		System.out.printf("Die Fl�che ist: %f\n", f.getFlaeche()); //ausgeben des Fl�cheninhalts
		
		/* Testen der Methoden der Zahlen-Klasse */
		Zahlen z = new Zahlen(); //erzeugen eines neuen Zahlen-Objekts
		System.out.printf("Testen der Zahlen-Methoden\n"); //"Header"
		/* Hinzuf�gen von allen m�glichen Test-Werten */
		z.add(3.5);
		z.add(4.8);
		z.add(2.3);
		System.out.printf("Die Summe betr�gt: %f\n", z.getSumme()); //ausgeben der Summe
		System.out.printf("Das Maximum ist: %f\n", z.getMaximum()); //ausgeben des Maximums 
		System.out.printf("Das Minimum ist: %f\n", z.getMinimum()); //ausgeben des Minimums
		
		
		/* Testen der Methoden der Rauminhalt-Klasse */
		
	}
}
