import java.util.Scanner;
public class birthday
{
  public static void main(String [] args)
  {
    Scanner key=new Scanner(System.in);
    int t=key.nextInt();
    String [] man=new String[t];
    String [] b={
      "Happy","birthday","to","you",
      "Happy","birthday","to","you",
      "Happy","birthday","to","Ruija",
      "Happy","birthday","to","you"};
        int k=0;int j=0;
    for(int i=0;i<t;i++)
    {
      man[i]=key.next();
    }
    for(int c=0;c<=15;c++)
    {
        if(k==t)
        {
          k=0;
        }
        if(j==16)
        {
          j=0;
        }
        System.out.println(man[k]+": "+b[j]);
        k++;j++;
      }   
  }
}