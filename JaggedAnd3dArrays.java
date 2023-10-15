public class JaggedAnd3dArrays {
    public static void main(String args[]){
        int nums[][] = new int[3][]; // jagged array
        nums[0] = new int[3];
        nums[1] = new int[4];
        nums[2] = new int[2];
        // here this is jagged array.
        for (int i = 0; i < nums.length; i++) {
            for(int j=0; j<nums[i].length; j++){
                nums[i][j] = (int)(Math.random() * 10);
            }
        }

        for (int n[]:nums){
            for (int m: n){
                System.out.print(m + " ");
            }
            System.out.println();
        }

        // we can also create 3d array.
        // drawbacks of arrays 
        // int newarr[] = new int[4];
        // array in java is an object, created inside heap memory, occupies a space , memoery it will occupy is contiguous
        // if you want to increase size, size is fixed, travesing is difficult and time consuming, what if you want to have array of different values that is how array works , as of now we have collection instead of arrays.
    }
}
