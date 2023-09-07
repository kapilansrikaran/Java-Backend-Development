class Method_Return_Type{
	
	static int square(int num){
		return num*num;
	}
	
	static void hello(){
		System.out.println("Hello World!");
	}
	
	static String[] heroes(){
			String[] superHeroes = {"Iron Man", "Super Man","Spider Man"};
			return superHeroes;
	}
	
	public static void main(String[] args){
		//System.out.println(square(25));
		
		//hello();
		
		String[] arr = heroes();
		for(String heroes : arr){
			System.out.println(heroes);
		}
		
	}
}