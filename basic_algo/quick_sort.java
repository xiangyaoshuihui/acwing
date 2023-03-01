package basic_algo;
import java.util.*;

public class quick_sort{

    public static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []q=new int[n];
        for(int i=0;i<n;i++)q[i]=sc.nextInt();
        quicksort(q,0,n-1);
        for(int i=0;i<n;i++)System.out.print(q[i]+" ");
    }

    public static void quicksort(int[] q,int l,int r){
        if(l>=r)return;
        int i=l-1,j=r+1,par=q[(l+r)/2];
        while(i<j){
            do i++;while(q[i]<par);
            do j--;while(q[j]>par);
            if(i<j){
                int t=q[i];
                q[i]=q[j];
                q[j]=t;
            }
        }
        quicksort(q,l,j);
        quicksort(q,j+1,r);

    }
}