import java.util.*;

public class findMax {
    public static void main(final String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int max =0;
        final int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            if(a[i]>max)
            max=a[i];
        }
        System.out.println(max);
        sc.close();
    }
}