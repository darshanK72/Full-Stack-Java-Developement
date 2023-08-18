package StateDesignPatern;

public class Management implements Connection {
	
	public void open() {
		System.out.println("Opening databses of Management");
	}

	@Override
	public void close() {
		System.out.println("Closing database of Management");
	}

	@Override
	public void log() {
		System.out.println("Logging activities of Management");
	}

	@Override
	public void update() {
		System.out.println("Updating Management database");
	}

}
