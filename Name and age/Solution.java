import java.util.* ;
import java.io.*; 
class Person {
    // Private variables
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Function to set the variables value
    public void setValue(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Function to print the variables value
    public void getValue() {
        System.out.println("The name of the person is " + name + " and the age is " + age + ".");
    }
}

class Solution {
	
	public static void main(String args[]) {
		
		// Write your code here
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int age = sc.nextInt();
		Person person = new Person(name, age);
		person.getValue();
	}

}
		