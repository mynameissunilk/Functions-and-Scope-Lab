public class day2lab{
    
    public static void main(String[] args){
	parameterCount(hello, there);
	
    }

    public static Sting parameterCount(String... strings){
	System.out.println(strings.length());
    }

    public static String stringLength(String a){
	System.out.println(a.length); 
    }

    public static String longestString(String a, String b){
	if(a.length > b.length)
	    System.out.println(" The longest string is: " + a);
	    else System.out.println("The longest string is: " + b); 
    }

    public static String typeQuit(String input){
	Scanner userinput = new Scanner(input); 
    }

    public static int isEven(int a){
	if(a%2)
	    System.out.println("Even!");
	else System.out.println("Odd!"); 
    }
    //print out the fibonacci sequence up to the given number 
     public static int fibonacci(int a){
	 if( a == 3){return a;}
	 
	 
	} 
}

