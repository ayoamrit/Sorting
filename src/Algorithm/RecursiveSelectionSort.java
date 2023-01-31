package Algorithm;

public class RecursiveSelectionSort {

    public RecursiveSelectionSort(){
        int[] array = {1,2,8,9,5,7,9,45,96,45,-1,-5,8,20,-21};  //creating an array

        sort(array,0);  //calling method to perform selection sort using recursion

        //using for loop to print the sorted array on the console
        for(int x = 0;x<array.length;x++){
            System.out.print(array[x]+" ");  //printing the array
        }
    }


    //method to get minimum number from the unsorted array
    private int minNumber(int[] array, int x, int index){
        if(x < array.length) {  //checking if the x is lesser than length of the array
            if(array[index] > array[x]){  //checking if there's any other number lesser than given number
                index = x;  //if there is any then index is the location of smaller element
            }

            return minNumber(array,x+1,index);  //calling method again
        }
        else{
            return index;  //returning index
        }
    }

    private void sort(int[] array, int number){
        if(number < array.length){  //checking if the number is lesser than length of the array
            int index = minNumber(array,number, number);  //calling method to get minimum index from the array

            //swapping values
            int temp = array[number];
            array[number] = array[index];
            array[index] = temp;

            sort(array,number+1);  //method calling itself
        }
        else{
            return;  //returning
        }
    }
}
