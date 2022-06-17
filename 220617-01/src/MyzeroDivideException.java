import java.time.LocalTime;

public class MyzeroDivideException extends Exception {
	public MyzeroDivideException(String message) {
		super(message + ", " + LocalTime.now() + "에 발생하였음");
	}

}
