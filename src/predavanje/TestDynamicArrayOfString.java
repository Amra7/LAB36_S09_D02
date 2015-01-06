package predavanje;

import java.util.Arrays;
/**
 * Class with main method of DynamicArrayOfString class.
 * 
 * @author amrapoprzanovic
 *
 */
public class TestDynamicArrayOfString {
	
	public static void main(String[] args) {
		
		DynamicArrayOfString daos = new DynamicArrayOfString();
		System.out.println("Velicina dinamickog niza je " + daos.getMyCount());
		System.out.println("Velicina cijelog niza je " + daos.getMyArrayLenght());
		daos.add("prvi");
	
		printState(daos);
		
		daos.add("drugi");
		printState(daos);
		
		daos.add("treci");
		printState(daos);
		
		daos.remove(2);
		printState(daos);
		
		daos.add("Cetvrti");
		printState(daos);
				
	}
	
	private static void printState(DynamicArrayOfString daos) {
		for (int i=0; i<daos.getMyCount(); i++){
			System.out.println(daos.getAt(i) + " ");				
		}
		System.out.println();
		System.out.println(Arrays.toString(daos.get()));
		System.out.println("Velicina dinamickog niza je " + daos.getMyCount());
		System.out.println("Velicina cijelog niza je " + daos.getMyArrayLenght());
		System.out.println("--------------------------");
		
	}

}
