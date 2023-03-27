package String;

public class ReverseWordByWord 
{
	public static void main(String[] args) 
	{
	String x= "my name is ashitosh khurana";
	String y []= x.split(" ");
	
		for(int i=0; i<y.length;i++) 
		{
		System.out.print(y[i]+ " ");
		}
	}
}
