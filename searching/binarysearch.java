public class binarysearch {
    public static void main(String[] args) {
        int [] arr = {2, 3, 4, 10, 40};
        int target = 10;
        int left = 0;
        int right = arr.length - 1;
        boolean found = false;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == target){
                found = true;
                System.out.println("Element found at index: " + mid);
                break;
            }
            if(arr[mid] < target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if(!found){
            System.out.println("Element not found in the array");
        }
    }
}