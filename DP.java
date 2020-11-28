import java.util.*;

public class DP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] value = new int[110];
        int[] weigth = new int[110];
        int[][] dp = new int[100][10010];
        int n = sc.nextInt();
        int W = sc.nextInt();

        for(int i = 0; i < n ; i++){
          value[i] = sc.nextInt();
          weigth[i] = sc.nextInt();
        }
        for(int i = 0; i < n ; ++i){
          for(int w = 0; w < W; ++w){
            if(w >= weigth[i]){
            dp[i+1][w] = Math.max(dp[i][w - weigth[i]] + value[i], dp[i][w]);
          }else
            dp[i+1][w] = dp[i][w];
          }
        }

        int ans = 0;
        for(int i = 0; i < n ; ++i){
          for(int w = 0; w < W; ++w){
            ans = Math.max(ans, dp[i][w]);
          }
        }

        System.out.println(ans);
        
    }
}
