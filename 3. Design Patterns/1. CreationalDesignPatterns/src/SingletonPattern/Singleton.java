package SingletonPattern;

public class Singleton {
	
	
/*	
	// 1. Private Constructor & Final Instance Singleton Method

	private static final Singleton INSTANCE = new Singleton();
	
	private Singleton()
	{
		
	}
	
	public static Singleton getInstance()
	{
		return INSTANCE;
	} 
*/
	
/*
	// 2. Static Initialization Singleton Method

	private static Singleton INSTANCE = null;
	
	static {
		try
		{
			if(INSTANCE == null)
			{
				INSTANCE = new Singleton();
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	public static Singleton getInstance()
	{
		return INSTANCE;
	} 
*/
	
/*
    // 3. Lazy Initialization Singleton Method
    
    private static Singleton INSTANCE = null;
    
	public static Singleton getInstance()
	{
		if(INSTANCE == null)
		{
			INSTANCE = new Singleton();
		}
		return INSTANCE;
	}
*/
	
/*
	// 4. Thread Safe Singleton Method
	
	private static Singleton INSTANCE = null;
	
	synchronized public static Singleton getInstance()
	{
		if(INSTANCE == null)
		{
			INSTANCE = new Singleton();
		}
		return INSTANCE;
	}
*/
	
/*
	// 5. Double Locking Mechanism
	
	private static Singleton INSTANCE = null;
	
	public static Singleton getInstance()
	{
		if(INSTANCE == null)
		{
			synchronized(Singleton.class)
			{
				if(INSTANCE == null)
				{
					INSTANCE = new Singleton();
				}
			}
		}
		return INSTANCE;
	}
*/
	
	// 6. Bill Plug Approach for Singleton
	
	private static class SingletonHolder
	{
		private static final Singleton INSTANCE = new Singleton();
	}
	
	
	public static Singleton getInstance()
	{
		return SingletonHolder.INSTANCE;
	}
}
