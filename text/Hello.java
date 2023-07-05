public class Hello {

    public static void reverse(int arr[], int arr2[], int size ,int n) {

        int temp = 0;
        for(int j=0;j<n;j++){
            for (int i = 0; i < size; i++) {
                if (i == 0) {
                    temp = arr[i];
                    arr2[i] = arr[i + 1];
                } else if (i == size - 1) {
                    arr2[i] = temp;
                } else {
                    arr2[i] = arr[i + 1];
                }
            }
        }
    
    }

    public static void main(String[] args) {
        System.out.println("Output");
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int arr2[] = new int[arr.length];
        int n = 3;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("Output");

        reverse(arr, arr2, arr.length,n);

        for (int j = 0; j < n; j++) {
            
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

    }
}