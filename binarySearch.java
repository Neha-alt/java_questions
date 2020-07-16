import java.util.*;

public class binarySearch {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int d=sc.nextInt();
        int low=0,high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]==d){
            System.out.println("Found at index "+ mid);
            break;
            }
            else if(d>a[mid]){
                low=mid+1;
            }
            else
            high=mid-1;
        }
        sc.close();
    }
}