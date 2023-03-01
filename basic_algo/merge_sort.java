package basic_algo;
import java.util.*;

public class merge_sort{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int []a=new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        merge_sort(a,0,n-1);
        for(int i=0;i<n;i++)System.out.print(a[i]+" ");
    }
    public static void merge_sort(int []a,int l,int r){
        if(l>=r)return;
        int m=(l+r)/2;
        merge_sort(a,l,m);
        merge_sort(a,m+1,r);
        int []z=new int[r-l+1];
        int i=l,j=m+1,k=0;
        while(i<=m&&j<=r){
            if(a[i]<=a[j]){
                z[k++]=a[i++];
            }
            else z[k++]=a[j++];
        }
        while(i<=m)z[k++]=a[i++];
        while(j<=r)z[k++]=a[j++];
        for(int o=0;o<r-l+1;o++){
            a[o+l]=z[o];
        }
    }
}