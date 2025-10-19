// Traverse Array

//public class arrayOperations {
//    public static void main(String[] args) {
//        int[] arr = {102,30,40,50};
//        for (int i = 0; i < arr.length; i++) { // Accessing elements one by one
//            System.out.print(arr[i]+" "); //Print all the element of array
//        }
//    }
//}


//Insertion withought index

//public class arrayOperations {
//    public static void main(String[] args) {
//        int[] arr = {10,20,30,40};
//        int element = 50;
//        int[] arr2 = new int[arr.length+1];
//
//
//        for (int i = 0; i < arr.length; i++){
//            arr2[i] = arr[i];
//        }
//
//        arr2[arr2.length-1] = element;
//
//        for (int i = 0; i< arr2.length;i++){
//            System.out.println(arr2[i]);
//        }
//    }
//}


//Insertion with index

//public class arrayOperations{
//    public static void main(String[] args){
//        int[] arr = {10,20,40,50};
//        int index = 2;
//        int element = 30;
//
//        // Create a new array with +1 size
//        int[] arr2 = new int[arr.length+1];
//
//        //First print no 0 to index
//        for (int i = 0; i<index;i++){
//            arr2[i] = arr[i];
//        }
//
//        //Initialize our element
//        arr2[index] = element;
//
//        // after initialize continue next elements
//        for (int i =index;i< arr.length;i++){
//            arr2[i+1] =arr[i];
//        }
//
//        //Print all element with new array
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.println(arr2[i]);
//        }
//    }
//}


// Searching

//public class arrayOperations {
//    public static void main(String[] args) {
//        int[] arr = {10,20,30,40,50};
//        int element = 30;
//        boolean found = false;
//        for (int i = 0; i< arr.length;i++){
//            if(arr[i] == element){
//                found=true;
//                break;
//            }
//        }
//        if (found == false){
//            System.out.println("Element is not found");
//        }
//    }
//}






