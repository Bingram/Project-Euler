
public class ProblemTWO {
	
	private static int MAX = 4000000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		answer();
		
	}
	
	private static int answer(){
		
		int temp = 0;
		int result = 2;
		
		int prev = 1;
		int cur = 2;
		System.out.println("Even Primes:");
		
		
		while(cur <= MAX){
			temp += (cur + prev);
			prev = cur;
			cur = temp;
			System.out.println(" " + temp);
			if(temp%2==0){ 
				System.out.println("Current Result " + result);
				result += temp;
				}
			temp = 0;
		}
		
		
		System.out.println("\nSum of EVEN Primes: " + result);
		
		return result;
		
	}

}
