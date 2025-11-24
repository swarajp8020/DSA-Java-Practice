package Practice.WeekdayPractice;

public class Nov24 {
    //QuickSelect family
//✔ Median using QuickSelect
    public static void main(String[] args) {
        int[] arr ={3,5,1,4,1,2,5};
        medianFinder(arr);
        System.out.println(medianFinder(arr));
    }
    static int medianFinder(int[] arr){
       int n = arr.length;
       int mid = n/2;
       if (n%2 != 0){
           return quickSelect(arr, 0, n-1,mid);
       }else {
           int a = quickSelect(arr, 0, n-1,mid);
           int b = quickSelect(arr, 0, n-1,mid-1);
           return (a+b)/2;
       }
    }
    static int quickSelect(int[] arr, int left, int right, int targetIndex){
        if (left<=right){
            int pivotIndex = partitionLomuto(arr, left, right);
            if (pivotIndex==targetIndex)return arr[pivotIndex];
            if (pivotIndex<targetIndex) return quickSelect(arr, pivotIndex+1, right,targetIndex);
            return quickSelect(arr,left,pivotIndex-1,targetIndex);
        }
        return -1;
    }
    static int partitionLomuto(int[] arr, int left, int right){
        int pivot = arr[right];
        int i =left-1;
        for (int j = left; j < right; j++) {
            if (arr[j]<=pivot){
                i++;
                swap(arr, i,j);
            }
        }
        swap(arr, i+1,right);
        return i+1;
    }
    static void swap(int[] arr, int a, int b){
        int temp =arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

////✔ Top-K Smallest
//    public static void main(String[] args) {
//        int[] arr ={3,5,1,4,1,2,5};
//        int k = 1;
//        int[] res = topKLargest(arr, k);
//        System.out.println(Arrays.toString(res));
//    }
//    static int[] topKLargest(int[] arr, int k){
//        int n = arr.length;
//        int targetIndex = k-1;
//        quickSelect(arr, 0, n-1, targetIndex);
//        return Arrays.copyOfRange(arr, 0,k);
//    }
//    static int quickSelect(int[] arr, int left, int right, int targetIndex){
//        if (left<=right){
//            int pivotIndex = partitionLomuto(arr, left, right);
//            if (pivotIndex==targetIndex)return arr[pivotIndex];
//            if (pivotIndex<targetIndex) return quickSelect(arr, pivotIndex+1, right,targetIndex);
//            return quickSelect(arr,left,pivotIndex-1,targetIndex);
//        }
//        return -1;
//    }
//    static int partitionLomuto(int[] arr, int left, int right){
//        int pivot = arr[right];
//        int i =left-1;
//        for (int j = left; j < right; j++) {
//            if (arr[j]<=pivot){
//                i++;
//                swap(arr, i,j);
//            }
//        }
//        swap(arr, i+1,right);
//        return i+1;
//    }
//    static void swap(int[] arr, int a, int b){
//        int temp =arr[a];
//        arr[a] = arr[b];
//        arr[b] = temp;
//    }

    //✔ Top-K Largest
//    public static void main(String[] args) {
//        int[] arr ={3,5,1,4,1,2,5};
//        int k = 3;
//        int[] res = topKLargest(arr, k);
//        System.out.println(Arrays.toString(res));
//    }
//    static int[] topKLargest(int[] arr, int k){
//        int n = arr.length;
//        int targetIndex = n-k;
//        quickSelect(arr, 0, n-1, targetIndex);
//        return Arrays.copyOfRange(arr, targetIndex,n);
//    }
//    static int quickSelect(int[] arr, int left, int right, int targetIndex){
//        if (left<=right){
//            int pivotIndex = partitionLomuto(arr, left, right);
//            if (pivotIndex==targetIndex)return arr[pivotIndex];
//            if (pivotIndex<targetIndex) return quickSelect(arr, pivotIndex+1, right,targetIndex);
//            return quickSelect(arr,left,pivotIndex-1,targetIndex);
//        }
//        return -1;
//    }
//    static int partitionLomuto(int[] arr, int left, int right){
//        int pivot = arr[right];
//        int i =left-1;
//        for (int j = left; j < right; j++) {
//            if (arr[j]<=pivot){
//                i++;
//                swap(arr, i,j);
//            }
//        }
//        swap(arr, i+1,right);
//        return i+1;
//    }
//    static void swap(int[] arr, int a, int b){
//        int temp =arr[a];
//        arr[a] = arr[b];
//        arr[b] = temp;
//    }


    //✔ Kth Smallest
//    public static void main(String[] args) {
//        int[] arr ={3,5,1,4,1,2,5};
//        int k = 1;
//        int res = quickSelect(arr, 0, arr.length-1, k-1);
//        System.out.println(res);
//    }
//    static int quickSelect(int[] arr, int left, int right, int targetIndex){
//        if (left<=right){
//            int pivotIndex = partitionLomuto(arr, left, right);
//            if (pivotIndex==targetIndex)return arr[pivotIndex];
//            if (pivotIndex<targetIndex) return quickSelect(arr, pivotIndex+1, right,targetIndex);
//            return quickSelect(arr,left,pivotIndex-1,targetIndex);
//        }
//        return -1;
//    }
//    static int partitionLomuto(int[] arr, int left, int right){
//        int pivot = arr[right];
//        int i =left-1;
//        for (int j = left; j < right; j++) {
//            if (arr[j]<=pivot){
//                i++;
//                swap(arr, i,j);
//            }
//        }
//        swap(arr, i+1,right);
//        return i+1;
//    }
//    static void swap(int[] arr, int a, int b){
//        int temp =arr[a];
//        arr[a] = arr[b];
//        arr[b] = temp;
//    }

    //✔ Kth Largest
//    public static void main(String[] args) {
//        int[] arr ={3,5,1,4,1,2,5};
//        int k = 1;
//        int res = quickSelect(arr, 0, arr.length-1, arr.length-k);
//        System.out.println(res);
//    }
//    static int quickSelect(int[] arr, int left, int right, int targetIndex){
//        if (left<=right){
//            int pivotIndex = partitionLomuto(arr, left, right);
//            if (pivotIndex==targetIndex)return arr[pivotIndex];
//            if (pivotIndex<targetIndex) return quickSelect(arr, pivotIndex+1, right,targetIndex);
//            return quickSelect(arr,left,pivotIndex-1,targetIndex);
//        }
//        return -1;
//    }
//    static int partitionLomuto(int[] arr, int left, int right){
//        int pivot = arr[right];
//        int i =left-1;
//        for (int j = left; j < right; j++) {
//            if (arr[j]<=pivot){
//                i++;
//                swap(arr, i,j);
//            }
//        }
//        swap(arr, i+1,right);
//        return i+1;
//    }
//    static void swap(int[] arr, int a, int b){
//        int temp =arr[a];
//        arr[a] = arr[b];
//         arr[b] = temp;
//    }
}
