package StateDesignPatern;

public class Accountant implements Connection{

	@Override
	public void open() {
		System.out.println("Opening databses of Accounting");
	}

	@Override
	public void close() {
		System.out.println("Closing database of Accounting");
	}

	@Override
	public void log() {
		System.out.println("Logging activities of Accounting");
	}

	@Override
	public void update() {
		System.out.println("Updating Accounting database");
	}

}
