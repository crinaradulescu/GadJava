package lab1.ch3;

public class Main {
    public void Pair(int[] v){
        int nr = 0;
        for(int i = 0; i < 5; i++){
            for(int j = i + 1; j < 5; j++){
                if(v[i] + v[j] == 0)
                    nr++;
            }
        }
        System.out.println(nr);
    }
    public static void main(String [] args){
       int[] v;
       v = new int[5];
       v[0] = 5;
       v[1] = -3;
       v[2] = -6;
       v[3] = 3;
       v[4] = -5;
       Main x = new Main();
       x.Pair(v);
    }
}
