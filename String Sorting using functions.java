import java.util.Arrays;
import java.util.Scanner;
public class SortFun{
 public static void main(String[] args){
  int n,i;
  Scanner read= new Scanner(System.in);
  System.out.println("Enter size of Array: ");
  n=read.nextInt();
  String arr[]=new String[n];
  System.out.println("Enter values: ");
  for(i=0;i<n;i++)
  {
   arr[i]=read.next();
  }
  Arrays.sort(arr);
  Arrays.toString(arr);
  for(i=0;i<n;i++)
  {
   System.out.print(arr[i]+",");
   }
    }
     } 
