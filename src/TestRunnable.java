import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

public class TestRunnable implements Runnable 
{
	@Override
	public void run()
	{
		for(int i = 1 ; i < 11 ; i++)
		{
			String repeated = Stream.generate(() -> "*").limit(i).collect(joining());
			int ascii = 32 + i ;
			String asscii = Character.toString((char) ascii);
			
			System.out.println(asscii + repeated + asscii);
		}
	}
	public static void main(String[] args) 
	{
		Thread thread = new Thread(new TestRunnable());
		thread.start();
//		int ascii = 33;
//		String asscii = Character.toString((char) ascii);
		//System.out.println(asscii);
	}
}
