import java.util.Scanner;
public class Sum
{
	public static void main(String[] args) {
	    int x,i=1;
	    int sum=0;
	    System.out.println("enter num of items:");
	    Scanner s=new Scanner(System.in);
	    x=s.nextInt();
	    while(i<=x)
	    {
	        sum=sum+i;
	        i++;
	    }
	    System.out.println("sum of"+x+ "num is:"+sum);
	    }
	}
