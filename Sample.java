import java.util.Scanner;
class Sample
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Please enter 10 numberes");
int arr[] = new int[10], sum=0;
double avg;
for(int i=0; i<arr.length; i++)  
{  
arr[i]=sc.nextInt();
sum+=arr[i];  
}  
avg = sum/10.0;
System.out.println("Sum is = "+sum+"\n Average is = "+avg);
}
}