import java.util.*;

public class Stamp {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[m+2];
		for (int i = 0; i < m; i++) {
			a[i]=sc.nextInt();
		}
		a[m] = 0;
		a[m+1] = n+1;
		Arrays.sort(a);
		int bmin=Integer.MAX_VALUE;
		int[] b = new int[m+1];
		for(int i = 0;i < m+1;i++){
			b[i] = a[i+1]-a[i]-1;
			if(bmin >b [i] && b[i] != 0){bmin = b[i];}
		}
		long ans = 0;
		for(int i = 0;i < m+1;i++){
			if(b[i]%bmin == 0){ans = ans+b[i]/bmin;}
			else{ans = ans+b[i]/bmin+1;}
		}
		System.out.println(ans);
	}
}
