import java.util.*;

public class sortWithoutBubbleSort {
    public static void main(final String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        final int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for(int j=0;j<n;j++){
            System.out.println(a[j]+" ");
        }
        sc.close();
    }
}