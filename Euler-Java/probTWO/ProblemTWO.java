
public class ProblemTWO {
	
	private static int MAX = 4000000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		answer();
		
	}
	
	private static int answer(){
		
		int temp = 2;
		
		int prev = 2;
		int cur;
		System.out.println("Even Primes:");
		for(int i = 3; i < MAX; i+=prev){
			
			prev = i;
			
			System.out.println(" " + i);
			if(i%2==0){ temp += i;}
		}
		
		System.out.println("\nSum of EVEN Primes: " + temp);
		
		return temp;
		
	}

}
