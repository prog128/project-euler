
public class Solution {
	public static void main(String args[]) {
		int a = 1, b = 2, sum = 0;
		
		while(b <= 4 * Math.pow(10,  6)) {
			
			//check for even fibonacci number
			if(b % 2 == 0) {
				sum += b;
			}
			
			//generate next fibonacci number
			int new_b = a + b;
			a = b;
			b = new_b;
		}
		
		System.out.println(sum);
	}
}
