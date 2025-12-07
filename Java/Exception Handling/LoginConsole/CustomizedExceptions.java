package practiceworkjava;

public class InvalidUsernameException extends Exception {


	public String toString() {
        return "Invalid username! Access denied.";
				
	}
	

}




package practiceworkjava;

public class InvalidPasswordException extends Exception {

	public String toString() {
        return "Invalid password!";
	}
	

}
s