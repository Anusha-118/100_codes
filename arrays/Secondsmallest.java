
class SecondSmallest {
    public static void main(String[] args) {

        int arr[] = {12, 10, 13, 9, 34, 5};

        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        int second = Integer.MAX_VALUE;

     
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > smallest && arr[i] < second) {
                second = arr[i];
            }
        }

        System.out.println("Second smallest element: " + second);
    }
}
    
