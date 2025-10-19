// Find largest element in array

//public class BasicsPrg {
//    public static void main(String[] args) {
//        int[] arr = {10,20,40,60,30};
//        int max = arr[0];
//        for (int i = 0; i< arr.length; i++){
//            if(arr[i] > max){
//                max = arr[i];
//            }
//        }
//        System.out.println("Largest no is: "+max);
//    }
//}

// Find Smallest element in array

//public class BasicsPrg {
//    public static void main(String[] args) {
//        int[] arr ={10,2,40,70,20};
//        int min = arr[0];
//
//        for (int i =0; i< arr.length;i++){
//            if(arr[i]<min){
//                min = arr[i];
//            }
//        }
//        System.out.println("smallest no is "+min);
//    }
//}

// sum of all elemnet

//public class BasicsPrg {
//    public static  void main(String[] args) {
//        int[] arr = {10,30,40,50};
//        int sum = 0;
//
//        for (int i=0; i< arr.length;i++){
//            sum += arr[i];
//        }
//    }
//}

// 2nd largest no

public class BasicsPrg {
    public static void main(String[] args) {
        int[] arr = {10,20,30,60,80};
        int largest = Integer.MIN_VALUE;
        int secondl = Integer.MIN_VALUE;

        for (int i = 0; i<arr.length;i++){
            if(arr[i] > largest){
                secondl = largest;
                largest = arr[i];
            } else if (arr[i]>secondl && secondl!=largest ) {
                secondl = arr[i];
            }
        }
        System.out.println("second largest element is: "+secondl);
    }
}