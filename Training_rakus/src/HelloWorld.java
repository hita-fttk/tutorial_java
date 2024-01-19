public class HelloWorld{
	public static void main(String[] args){
		for(int i=0; i<args[1].length();i++){
		introduction(args[0]+"!!!");
		}
	}
	public static void introduction(String name){
		System.out.println(name);
	}	

}
