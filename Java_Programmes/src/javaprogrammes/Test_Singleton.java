package javaprogrammes;

public class Test_Singleton {
	
	private static Test_Singleton t = null;
	
	private Test_Singleton()
	{
		
	}

	public static Test_Singleton getTest_Singleton()
	{
		if(t==null) {
			t = new Test_Singleton();
		}
		return t;
	}
	
	Test_Singleton t1 = Test_Singleton.getTest_Singleton();
	
}

