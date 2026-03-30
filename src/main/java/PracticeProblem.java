public class PracticeProblem {
	public static void main(String args[]) {
	}
	public static int sumOfDigits(int x) {
		x = Math.abs(x);
	    if (x == 0 && x <= 9) {
	      return 0;
	    }
		return (x%10) + sumOfDigits(x / 10); 
	}
	public static int factorial(int y) {
	    if (y == 0) {
	      return 1;
	    }
		if (y < 0) {
	      return 0;
	    }
		return y * factorial(y-1); 
	}
}