package StateDesignPatern;

public class StateController {
	
	private Accountant accountant;
	private Management management;
	private Sales sales;
	
	private Connection con;
	
	public StateController()
	{
		this.accountant = new Accountant();
		this.management = new Management();
		this.sales = new Sales();
	}
	
	public void setManagementConnection()
	{
		this.con = this.management;
	}
	
	public void setSalesConnection()
	{
		this.con = this.sales;
	}
	
	public void setAccountantConnection()
	{
		this.con = this.accountant;
	}
	
	public void open()
	{
		this.con.open();
	}
	public void close()
	{
		this.con.close();
	}
	public void log()
	{
		this.con.log();
	}
	public void update()
	{
		this.con.update();
	}
	
	

}
