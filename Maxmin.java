package janani;
import java.util.Scanner;
public class Maxmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
int n,i,j;
//int []a={4,5,9,2};
//System.out.println("enter the elements");
System.out.println("enter the number");
Scanner ja=new Scanner(System.in);
n=ja.nextInt();
int []a=new int[n];
for(i=0;i<n;i++){
	a[i]=ja.nextInt();
}
int max=a[0];
for(i=1;i<n;i++){
	if(max<a[i]){
		max=a[i];
	}
}
int min=a[1];
	for(j=0;j<n;j++){
	if(min>a[j]){
		min=a[j];
	}
}
System.out.println(min+" "+max);
	
}
}
