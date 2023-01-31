package Algorithm;

public class RecursiveInsertionSort{

    public RecursiveInsertionSort(){
        int[] numberArray = {1,9,2,7,8,9,5,6,-1,1,5,2,3};  //initializing an array

        sort(numberArray,0);  //calling method to sort the array using recursion
        printArray(numberArray, 0);  //calling method to print the array using recursion
    }

    //method swapping values
    private void swapping(int[] array, int y){
        if(y < array.length-1){
            if(array[y] > array[y+1]){

                //swapping values
                int temp = array[y];
                array[y] = array[y+1];
                array[y+1] = temp;
            }

            swapping(array,y+1);
        }
        else{
            return;
        }
    }

    private void sort(int[] array, int x){
        if(x < array.length){
            swapping(array,0);  //calling method to swap values

            sort(array,x+1);  //recursion method
        }
        else{
            return;
        }
    }

    //method printing the array
    private void printArray(int[] array, int x){
        if(x < array.length){
            System.out.print(array[x]+" ");

            printArray(array,x+1);
        }
        else{
            return;
        }
    }
}
