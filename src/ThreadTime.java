import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadTime 
{

	public final static void clearConsole()
	{
	    try
	    {
	        final String os = System.getProperty("os.name");
	        
	        if (os.contains("Windows"))
	        {
	            Runtime.getRuntime().exec("cls");
	        }
	        else
	        {
	            Runtime.getRuntime().exec("clear");
	        }
	    }
	    
	    catch (final Exception e)
	    {
	        //  Handle any exceptions.
	    }
	}
  public static void main(String[] args) 
  {
    
    Thread thread = new Thread(new MonRunnable(1000));
    
//    DateFormat df = new SimpleDateFormat("HH:mm:ss"); 
//    System.out.println(df.format(new Date()));
    
    thread.start();
  }

  private static class MonRunnable implements Runnable 
  {
	
    private long delai;
    
    public MonRunnable(long delai) 
    {
      this.delai = delai;
      
    }

    @Override
    public void run() 
    {
    	while(true) 
    	{
	      try 
	      {
	    	DateFormat df = new SimpleDateFormat("HH:mm:ss");
	        Thread.sleep(delai);
	        clearConsole();
	        System.out.println(df.format(new Date()));
	      } 
	      catch (InterruptedException e) 
	      {
	        e.printStackTrace();
	      }
    	}
    }
  }
}