package vjezbe;


public class StudentTest {

	public static void main(String[] args) {
		
		Student prvi = new Student("Haris", 10000, 9.5);
		Student drugi = new Student("Harisa", 10000, 9.5);
		Student treci = new Student("Sanela", 10000, 9.0);
		Student cetvrti = new Student("Nermin", 9999, 9.0);
		Student peti = new Student("Jesenko", 9876, 9.7);
		Student sesti = new Student("Haris", 10000, 9.5);
		
		Student[] razred = new Student[]{ prvi, drugi, treci, cetvrti, peti, sesti};
		insertionSort(razred);
		for (int i = 0; i < razred.length; i++) {
			System.out.println(razred[i].toString());
		}	
//		System.out.println(prvi.compareTo(sesti));
	}

/**
 * Insertion Sort za Studente;
 * Rangira studente po prosjekuOcjena GPA, te onda rangira Studente po brojuIndeksa, te tek onda po Imenima Studenata.
 */
	private static void insertionSort(Student[] razred) {
		
		for (int i = 1; i < razred.length; i++) {
			Student current = razred[i];
			int j = i;
			for ( j = i; (j > 0) && (current.compareTo(razred[j-1]))==1; j--) {
				razred[j] = razred[j-1];
			}
			razred[j] = current;
		}
	}
}
