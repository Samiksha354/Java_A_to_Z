package DSA.Sorting;

public class SelectionSorting {

     public int[]  Sort(int[] arr){
         int n=arr.length;
         for(int i=0;i<n-2;i++){
             int mini=i;
             for(int j=i;j<n-1;j++){
                 if(arr[j] < arr[mini]){
                     mini=j;
                 }

                 int temp=arr[mini];
                 arr[mini]=arr[j];
                 arr[j]=temp;

             }
         }


         return arr;
     }


    public static void main(String [] args){
        int[] arr={13, 46,24,52, 20, 9};

        SelectionSorting s1=new SelectionSorting();
        int[] brr=s1.Sort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print("  "+brr[i]);
        }

    }
}
