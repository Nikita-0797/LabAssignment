package lambdaAssignment;

public class Exercise3 {

	public static void main(String[] args) {

		String name = "NikiKangude";
		String pass = "nik@123";
		Authentication p = ((username, password) -> {
			if (username.equals(name) && password.equals(pass))
				return true;
			else
				return false;
		});
		System.out.println(p.checkIdentity("NikiKangude", "nik@123"));
	}
	
public interface Authentication {
		
		boolean checkIdentity(String username, String password);

	}
}
