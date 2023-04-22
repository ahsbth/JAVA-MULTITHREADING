class Thread1 extends Thread
{
	int x;
	public void run()
	{
		for(x=1;x<=5;x++)
		{
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
			System.out.println("z="+z);
		}
	}
}

class Thread_test
{
	public static void main(String args[])
	{
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		Thread3 t3=new Thread3();
		t1.start();
		t2.start();
		t3.start();
		t1.run();
		t2.run();
		t3.run();
	}
}

		