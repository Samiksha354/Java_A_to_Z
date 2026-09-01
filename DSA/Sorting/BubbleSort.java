package DSA.Sorting;

public class BubbleSort {
    public int[]  Sort(int[] arr){
        for(int i=0;i<arr.length-1;i++) {
            int swap = 0;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }

            }
            if (swap == 0) {
                System.out.print("Array is already sorted.");
                break;
            }
        }
        return arr;
    }


    public static void main(String [] args){
            int[] arr={9 ,13, 20,24, 46,52};
            BubbleSort s1=new BubbleSort();
        int[] brr=s1.Sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print("  "+brr[i]);
        }
    }
}
