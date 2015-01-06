package predavanje;

import java.util.Arrays;
/**
 * Class DynamicArrayOfString where are all methods made.
 * @author amrapoprzanovic
 *
 */
public class DynamicArrayOfString {

	private static final int INITIAL_NUM_OF_ELEMENTS = 4;
	private String[] myArray;
	private int myCount;

	/**
	 * Default Constructor for DynamicArrayOfString without parameters
	 */
	public DynamicArrayOfString() {

		this(INITIAL_NUM_OF_ELEMENTS); // poziva konstruktor ispod

		/* ovo ne treba */
		/*
		 * super(); myArray = new String [INITIAL_NUM_OF_ELEMENTS]; myCount= 0;
		 */
	}

	/**
	 * Constructor for DynamicArrayOfString with parameter inicialNoOfElements.
	 * inicialNoOfElements - size of array
	 */
	public DynamicArrayOfString(int inicialNoOfElements) {
		super();
		myArray = new String[inicialNoOfElements];
		myCount = 0;
	}

	/**
	 * Add string into arrays of strings.
	 * @param str  -string that we add.
	 */
	public void add(String str) {
		if (myCount == myArray.length) {
			myArray = Arrays.copyOf(myArray, myArray.length * 2);
		}
		myArray[myCount] = str;
		myCount++;
	}

	/**
	 * Set new String in arrays of string on position that we send.
	 * @param offset
	 * @param str
	 */
	public void set(int offset, String str) {
		if (offset < 0 || offset >= myCount)
			throw new IndexOutOfBoundsException("Your offset " + offset
					+ "does not belogng to [0, " + (myCount - 1) + "].");
		myArray[offset] = str;

	}

	/**
	 * Getters for specific String in array of Strings
	 * @param offset - position of Sting in array.
	 * @return array of Strings
	 */
	public String getAt(int offset) {
		if (offset < 0 || offset >= myCount)
			throw new IndexOutOfBoundsException("Your offset " + offset
					+ "does not belogng to [0, " + (myCount - 1) + "].");
		return myArray[offset];

	}

	/**
	 * Getter for array of string.
	 * @return array of string without empty (null) space.
	 */
	public String[] get() {
		return Arrays.copyOf(myArray, myCount);
	}

	/**
	 * Remove string from position 'offset' that we send.
	 * @param offset - position of String in array.
	 */
	public void remove(int offset) {
		if (offset < 0 || offset >= myCount)
			throw new IndexOutOfBoundsException("Your offset " + offset
					+ "does not belogng to [0, " + (myCount - 1) + "].");
		for ( int i = offset; i<myCount-1; i++){
			myArray[i]= myArray[i+1];
		}
		myCount--;
		
		/*
		 * If we have lot of empty places in array of String this is the way to reduce it.
		 */
		if(myCount < myArray.length/3){
			myArray= Arrays.copyOf(myArray, myArray.length/2);
		}
	}

	public int getMyCount() {
		return myCount;
	}
	
	public int getMyArrayLenght() {
		return myArray.length;
	}
	
}
