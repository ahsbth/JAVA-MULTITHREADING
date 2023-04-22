class Thread1 extends Thread
{
	int x;
	public void run()
	{
		for(x=1;x<=5;x++)
		{
			if(x==2)
			{
				yield();
			}
			System.out.println("x="+x);
		}
	}
}

class Thread2 extends Thread
{
	int y;
	public void run()
	{
		for(y=1;y<=5;y++)
		{
			if(y==3)
			{
				stop();
			}
			System.out.println("y="+y);
		}
	}
}
class Thread3 extends Thread
{
	int z;
	public void run()
	{
		for(z=1;z<=5;z++)
		{
			if(z==2)
			{
				try
				{
					sleep(50000);
				}
		     	catch(Exception e)
				{
				}
			}
			System.out.println("z="+z);
		}
	}
}
class Lyfecycle
{
	public  static void main(String args[])
	{
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		Thread3 t3=new Thread3();
		t1.start();
		t2.start();
		t3.start();
	}
}

	
	
	
	
	