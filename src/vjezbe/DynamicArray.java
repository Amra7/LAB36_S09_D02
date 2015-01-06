package vjezbe;


public class DynamicArray {
	private int[] array;
	private int count = 0;
	private final int INIT_SIZE =5;
	
/**
 * Defaultni Konstruktor!	
 */
	public DynamicArray() {
	this.array = new int[INIT_SIZE];
	}
	
/**
 * Konstruktor koji prima velicinu niza;	
 * @param size
 */
	public DynamicArray(int size) {
	this.array = new int[size];	
	}

/**
 * getSize() metoda koja vraca count;
 * @return
 */
	public int getSize() {
		return count;
	}
	
/**
 * Function that adds the newElements to the array; ulkljucuje resize() funkciju;
 * @param newElement
 */
	public void add(int newElement) {
		
		if (count == array.length) {
			resize();
		}
		array[count] = newElement;
		this.count++;
		}
	
// Resize() funkcija;	
	private void resize() {
		int newSize = count * 2;
		int[] array2 = new int[newSize]; 
		for (int i = 0; i < count; i++) {
			array2[i] = array[i];
		}
		this.array = array2;
	}
	
// Vraca vrijednost u nizu na proslijedjenom indeksu ;	
	public int getAt(int index) {
		if (index < count && index >= 0) {
			return this.array[index];
		} else throw new IndexOutOfBoundsException();
	}
	
// Brise vrijednost na poziciji proslijedjenom indexu u nizu; ukljucuje pomjeriNiz() funkciju;
	public void removeAt(int index) {
		if (index < count && index >= 0) {
			pomjeriNiz(index);
		} else throw new IndexOutOfBoundsException();
			
	}
//pomjeranje niza();
	private void pomjeriNiz(int index) {
		for (int i = index; i < count-1; i++) {
			this.array[i] = this.array[i+1];
			count--;
		}
}
/**
 * Funkcija koja vraca niz.
 * @return
 */
	public int[] toArray() {
		int[] array2 = new int[count];
			for (int i = 0; i < count; i++) {
				array2[i] = this.array[i];
			}
		this.array = array2;
		return this.array;
	}
	
	
	
	
}
