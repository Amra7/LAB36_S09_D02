package vjezbe;


public class DynamicTest {

	public static void main(String[] args) {
		
		DynamicArray myDA = new DynamicArray(2);
		myDA.add(5);
		myDA.add(8);
		myDA.add(13);
		myDA.add(15);
		myDA.add(17);
		myDA.add(23);
		
		System.out.println(myDA.getAt(4));
		myDA.removeAt(4);
		System.out.println(myDA.getAt(4));
	}

}
