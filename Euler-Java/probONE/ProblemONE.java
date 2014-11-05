
public class ProblemONE {

	private static int MAX = 1000;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Sum of Multiples to " + MAX + " equals " +getThreeOrFive(MAX));
		
	}
	
	private static int getThreeOrFive(int max){
		int temp = 0;
		
		for(int i = 1; i < max; i++){
			if(i%3==0 || i%5==0){
				temp += i;
				System.out.println("Multiple found " + i + "\n");
			}
		}
		
		return temp;
	}

}
