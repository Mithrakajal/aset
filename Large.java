import java.util.Scanner;
public class Large
{
	public static void main(String[] args){
	    int x,y,z;
	    Scanner s=new Scanner(System.in);
	    System.out.println("enter the first num:");
	    x=s.nextInt();
	    System.out.println("enter the second num:");
	    y=s.nextInt();
	    System.out.println("enter the third num:");
	    z=s.nextInt();
	    if(x>y && x>z)
	    System.out.println("largest num is:"+x);
	    else if(y>z)
	    System.out.println("largest num is:"+y);
	    else
	    System.out.println("largest num is:"+z);
	}
}
