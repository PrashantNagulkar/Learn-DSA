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

public class BasicsPrg {
    public static void main(String[] args) {
        int[] arr ={10,2,40,70,20};
        int min = arr[0];

        for (int i =0; i< arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("smallest no is "+min);
    }
}

