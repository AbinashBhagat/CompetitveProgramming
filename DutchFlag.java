public class DutchFlag {
    public static void main(String [] args){
    int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
    int arrSize = arr.length-1;

    int high = arrSize, mid = 0, low = 0;

    while(mid<=high){
        int temp = 0;
        if (arr[mid] == 0){
            temp = arr[mid];
            arr[mid] = arr[low];
            arr[low] = temp;
            printArray(arr, arr.length);
            low ++;
            mid ++;
        }
        else if (arr[mid] == 1){
            printArray(arr, arr.length);
            mid ++;
        }
        else{
            temp = arr[mid];
            arr[mid] = arr[high];
            arr[high] = temp;
            printArray(arr, arr.length);
            high --;
        }

    }
    for(int num: arr){
        System.out.println(num+" ");
    }
    }

    static void printArray(int arr[], int arr_size)
    {
        int i;
        for (i = 0; i < arr_size; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }
    
}
