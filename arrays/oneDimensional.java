import java.nio.channels.Pipe.SourceChannel;
import java.util.*;

class oneDimensional{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int a [] = new int[10];

        for(int i = 0; i < a.length; i++){
            System.out.println("Enter an integer to save inside the array: ");
            a[i] = sc.nextInt();
        }
        
        for(int i = 0; i < a.length; i++){
            System.out.println(a[i]);
        }
        sc.close();
    }

}