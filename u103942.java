import java.util.Scanner;
public class u103942
{
  public static void main (String args[])
  {
    int limit=20000010;
    int []data_container=new int[limit+1];
    int i=3;
    Scanner key=new Scanner(System.in);
    while(i<=Math.sqrt(limit))
    {
      int j=i*i;
      if(data_container[i]==0)
      {
        while(j<=limit)
        {
          data_container[j]=1;
          j+=2*i;
        }
      }
      i++;
    }
    i=3;
    int counter=0;
    int [] man=new int [limit];
    while(i<=limit)
    {
      if (data_container[i]==0)
      {
        man[counter]=i;
        counter++;
      }
      i+=2;
    }
    int n=0;
    while(key.hasNextInt())
    {
      int v=key.nextInt();
      for(i=0;i<man.length;i++)
      {
      if(man[i+1]-man[i]==2)
      {
      n++;
      }
      if(v==n)
      {
      System.out.println("("+man[i]+","+" "+man[i+1]+")");
      n=0;
      break;      
      }
      }
    }
  }
}