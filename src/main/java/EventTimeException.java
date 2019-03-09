public class EventTimeException extends Exception {
	public EventTimeException () {
		super("Time Error");
	}

	public EventTimeException (String msg) {
		super(msg);
	}
}
