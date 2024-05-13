
public class NotErros extends Exception {

	public NotErros() {
		super("Invalid number. It should be between 1 and 10");
	}
	
	public NotErros(String message ) {
		super(message);
	}
}