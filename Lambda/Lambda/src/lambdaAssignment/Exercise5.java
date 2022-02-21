package lambdaAssignment;

public class Exercise5 {
	

	static Factorial f1;

	public static void main(String[] args) {
		
		f1 = (n) -> {
			if (n == 0)
				return 1;
			else {
				return n * (f1.fact(n - 1));
			}
		};
		int i = f1.fact(7);
		System.out.println(i);
	}

public interface Factorial {
	
	int fact(int n);

    }

}
