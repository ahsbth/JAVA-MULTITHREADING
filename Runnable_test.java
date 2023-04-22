
class Rectangle implements Runnable
{
	int l,b;
	
	public void run()
	{
		
		l=4;
		b=5;
		float a=l*b;
		System.out.println("Area of Rectangle="+a);
	}
}

class Circle implements Runnable
{
	float r;
	public void run()
	{
		
		r=7;
		double a=3.14*r*r;
		System.out.println("Area of Circle="+a);
	}
}
class Runnable_test
{
	public static void main(String args[])
	{
		Rectangle r=new Rectangle();
		Circle c=new Circle();
		Thread t1=new Thread(r);
		Thread t2=new Thread(c);
		t1.start();
		t2.start();
		t1.run();
		t2.run();
	}
}

		
