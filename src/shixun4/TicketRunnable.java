package shixun4;

public class TicketRunnable implements Runnable
{
	private int tickets=50;
	public void run()
	{
		while(true)
		{
			if(tickets>0)
			{
				System.out.println(Thread.currentThread().getName()+"is sailing ticket"+tickets);
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e)
				{
					e.printStackTrace();
				}
				tickets--;
			}
			else {
				break;
			}
		}										
	}
	public int getTickets()
	{
		return tickets;  
	}
}
