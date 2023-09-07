class Prob_Square_of_a_Number{
	public static void main(String[] args){
		square(5);
		square(10);
	}
	
	static void square(int num){
		System.out.println(num * num);
	}
	
}
/*
When we write a method in a class and call it inside the main method, 
we must use the static keyword for the method. This only applies when we're not using an object.
*/

