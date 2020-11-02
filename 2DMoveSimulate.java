import java.util.*;


public class 2DMoveSimulate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        XY[] kobi = new XY[N];
        int map[][] = new int[10000][10000];
        for(int i =0;i<N;i++){
            int x = sc.nextInt() + 5000;
            int y = sc.nextInt() + 5000;
            kobi[i]= new XY(x, y, 0,0);
            map[kobi[i].x][kobi[i].y] = 1;
        }
        int end = 0;
        int count = 0;
        int hosu = 1;
        while(end < N){
          for(int d = 0; d < 4;d++){
              for(int j = 0; j < hosu;j++){
                  for(int i =0; i < N;i++){
                      if(kobi[i].j != 1){
                        switch(d){
                            case 0:
                                kobi[i].x += 1;
                                break;
                            case 1:
                                kobi[i].y -= 1;
                                break;
                            case 2:
                                kobi[i].x -= 1;
                                break;
                            case 3:
                                kobi[i].y += 1;
                                break;
                        }
                        if(map[kobi[i].x][kobi[i].y] == 0){
                                map[kobi[i].x][kobi[i].y] = 1;
                                kobi[i].w += 1;
                            }else{
                                kobi[i].j = 1;
                                end++;
                        }
                }
            }
            }
            if(d == 1 || d == 3)
            hosu++;
        }
        }
        int max = 0;
        for(int i =0; i < N;i++){
            if(kobi[i].w >= max)
            max = kobi[i].w;
        }
        System.out.print(max);
    }
}
class XY {
    int x;
    int y;
    int w;
    int j;
    XY(int x, int y,int w,int j) {
        this.x = x;
        this.y = y;
        this.w = w;
        this.j = j;
    }
}
