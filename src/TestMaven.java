import MavenTest.Wrokbook.WorkTest;

public class TestMaven {
	
	public void rn()
	{
		WorkTest tst = new WorkTest();
		tst.getCommands("Hi");
	}
	
	
	public static void main(String[] args) {
		new TestMaven().rn();
	}


}
