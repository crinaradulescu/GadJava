package lab1.ch4;

public class Main {
    public void Pair(int[] v){
        int nr = 0;
        for(int i = 0; i < 4; i++){
            for(int j = i + 1; j < 4; j++){
                for(int k = j + 1; k < 4; k++)
                if(v[i] + v[j] + v[k] == 0) {
                    nr++;
                    i++;
                    j++;
                    k++;
                }
            }
        }
        System.out.println(nr);
    }
    public static void main(String[] args){
        int[] v;
        v = new int[4];
        v[0] = -1;
        v[1] = -1;
        v[2] = -1;
        v[3] = 2;
        Main x = new Main();
        x.Pair(v);
    }
}
