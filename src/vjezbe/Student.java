package vjezbe;


public class Student {
	private String name;
	private int indexNum;
	private double gpa;
	
/**
 *  Konstruktor koji prima sve atribute.
 */
	public Student(String name, int indexNum, double gpa) {
		this.name = name;
		this.indexNum = indexNum;
		this.gpa = gpa;
	}
// Getters and Setters!
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getIndexNum() {
	return indexNum;
}
public void setIndexNum(int indexNum) {
	this.indexNum = indexNum;
}
public double getGpa() {
	return gpa;
}
public void setGpa(double gpa) {
	this.gpa = gpa;
}

/**
 * CompareTo metoda za poredjenje dva studenta..
 * Prvo poredi GPA studenata, te brojIndexa studenata, te tek onda imena studenata;
 * @param Student other
 * @return int 1, 0 ili -1;
 */
	public int compareTo(Student other) {
		if (this.getGpa() > other.getGpa()) {
			return 1;
		} else if (this.getGpa() < other.getGpa()) {
			return -1;
		} else if (this.getGpa() == other.getGpa()) {

			if (this.getIndexNum() > other.getIndexNum()) {
				return 1;
			} else if (this.getGpa() < other.getGpa()) {
				return -1;
			} else if (this.getGpa() == other.getGpa()) {

				return (this.getName().compareTo(other.getName()));

			}
		}
		return 0;
	}
/**
 * ToString metoda za Student;
 */
 public String toString() {
	 return this.getGpa() + "\n" + this.getIndexNum() + "\n" + this.getName() + "\n**************\n";
 }
 
}
