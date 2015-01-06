package vjezbe;


public class SortPractice {

	public static void main(String[] args) {
		
		int[] myArray = new int[] {7, 2, 5, 4, 3, 1, 6, 10, 8, 9};
//		insertionSort(myArray);
		selectionSort(myArray);
		ispisNiza(myArray);
		
		
	}
/**
 * Funkcija koja ispisuje svaki clan u nizu.
 */
private static void ispisNiza(int[] myArray) {
		for (int i = 0; i < myArray.length; i++) {
			System.out.print(myArray[i] + " ");
		}
		
	}
/**
 * Funkcija koja sortira niz od manjeg ka vecem. Po insertionSort vrsti sortiranju;
 * 1-va FOR PETLJA prolazi kroz citav niz od 1-vog clana, uzimajuci svaki clan tog niza u jednom trenutku da bude "int currentNum" - broj kojeg poredimo sa ostalim clanovima;
 * 2-ga FOR PETLJA vrsi to poredjenje, uzetog "int currentNum"-a; i svakog clana prije njega. tj. nasa druga FOR PETLJa polazi od i-te pozicije i ide do 1-ve pozicije u nizu.
 * U 2-goj FOR PETLJI, ako nadje da je nas CURRENTnUM manji od onog na poziciji prije njega -> if (currentNum < myArray[j - 1]), neka na njegovu poziciju kopira taj broj prije njega;
 * a to je "myArray[j] = myArray[j - 1];", u slucaju da nije manji, neka stane i smanji j za jedan i ponovo vrsi poredjenje vrijednosti pozicija j i j-1.
 * @param myArray
 */
	private static void insertionSort(int[] myArray) {
		for (int i = 1; i < myArray.length; i++) {
			int currentNum = myArray[i];
			int j = i;
			for (j = i; j > 0 && currentNum < myArray[j - 1]; j--) {
				myArray[j] = myArray[j - 1];
			}
			myArray[j] = currentNum;
		}
	}


/**
 * Funkcija koja sortira niz od manjeg ka vecem. Po selectionSort vrsti sortiranju;
 * @param myArray
 */
	private static void selectionSort(int[] myArray) {
		int j;
		for (int i = 0; i < myArray.length-1; i++) {
			int nasMin = i;
			for (j = i+1; j < myArray.length; j++) {
				if (myArray[j] < myArray[nasMin]) {
					nasMin = j;
				}
			}
			int temp = myArray[nasMin];
			myArray[nasMin] = myArray[i];
			myArray[i] = temp;
			
		}
	}
}