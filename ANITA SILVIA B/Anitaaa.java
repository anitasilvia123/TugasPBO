import java.util.Arrays;

public class Anitaaa  {
    public static void main(String[] args) {
        
        //input ksatria        
        int[] A = { 8,3,1,2 };
        Arrays.sort(A);
        int B = 0;

        //input dragon
        int[] C = { 7, 2 };
        Arrays.sort(C);
        int indeksC  = 0;
        for (int x : A ){
            if (indeksC < C.length){
                if (x >= C[indeksC]){
                    B += x;
                    indeksC++;
                }
            }
        }
        if (indeksC == C.length){
            System.out.println( B);
        } 
        else {
            System.out.println("Knight Fall");
        }
    }

}