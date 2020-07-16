import java.util.*;

public class linearSearch {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        final int a[] = new int[n];
        int d;
        d=sc.nextInt();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]==d){
                System.out.println("found at index "+i);
            break;
            }
        }
       
        sc.close();
    }
}