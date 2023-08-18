package StateDesignPatern;

public class Sales implements Connection{
	
	public void open() {
		System.out.println("Opening databses of Sales");
	}

	@Override
	public void close() {
		System.out.println("Closing database of Sales");
	}

	@Override
	public void log() {
		System.out.println("Logging activities of Sales");
	}

	@Override
	public void update() {
		System.out.println("Updating Sales database");
	}

}
