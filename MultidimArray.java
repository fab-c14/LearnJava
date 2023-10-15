public class MultidimArray{
    public static void main(String args[]){
        // we can have multidimensional arrays 
        // we can have an array of arrays
        int arr[][] = {
            {2,3,4},
            {1,2,3},
            {2,4,6}
         };
        //  System.out.println(arr[0][0]);
        //  System.out.println(arr[0][1]);
        // using nested loops
        for( int i = 0; i<3; i++){
            for (int j = 0; j<3; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int arr1[][] = new int[4][3];
        //  for( int i = 0; i<3; i++){
        //     for (int j = 0; j<4; j++){
        //         System.out.print(arr1[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // 
        // int random = (int) (Math.random() * 10);

         for( int i = 0; i<4; i++){
            for (int j = 0; j<3; j++){
                arr1[i][j] = (int) (Math.random() * 10);
              
            }
        }


        //  for( int i = 0; i<4; i++){
        //     for (int j = 0; j<3; j++){
        //         System.out.print(arr1[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // enhanced for loop

        for (int n[] : arr1){ // here n is not a simple value, it is array also
            // System.out.println(n);
            for( int m : n){
                System.out.println(m);// printing every value in array
            }
        }
    }
}