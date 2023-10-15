public class Arrays {
    public static void main(String args[]){
        // int i = 5;
        // int j = 6;
        // int k = 7;
        // we have 3 values - we can save all three values in same values , we might have 100 variables so we can use arrays

        //
        // int num = {5,6,7};// not valid, because in integer we can not store mutliple values 
        // int num[] = {5,6,7}; // imagine a tray of cups, carry a tray of cups to hall 
        // int num1 = new int[4]; // create a int array of size 4 size is fixed

        // real implimentation of array 

        int nums[] = {3,7,2,4};
        System.out.println(nums);
        System.out.println(nums[0]);// printing the first element
        System.out.println(nums[1]);// print second element ... and so..on
        int nums1[] = new int[4];
        System.out.println(nums1[0]); // all elements are set to 0 by default 
        nums1[0] = 9;
        System.out.println(nums1[0]);
    }
}
