package Algorithm;

public class MergeSort{

    public MergeSort(){
        int[] array = {1,2,8,9,5,7,9,45,96,45,-1,-5,8,20,-21};  //creating an array
        sort(array);  //calling method to perform merge sort function

        System.out.println();  //leaving a line
        System.out.print("Merge Sort: ");  //printing
        //using for loop to print sorted array
        for(int x = 0;x<array.length;x++){
            System.out.print(array[x]+" ");  //printing
        }
    }

    private static void sort(int[] array){

        //creating a base case to end recursion
        if(array.length <= 1){
            return;  //returning
        }

        //dividing array into two parts
        int[] first = new int[array.length / 2];  //first part
        int[] second = new int[array.length - first.length];  //second part

        //inserting values to the first part of the array
        for(int x = 0; x<first.length;x++){
            first[x] = array[x];  //inserting from main array
        }

        //inserting values to the second part of the array
        for(int x = 0; x<second.length;x++){
            second[x] = array[first.length + x];  //inserting from main array
        }

        sort(first);  //calling method and passing first array
        sort(second);  //calling method and passing second array

        //calling method to sort the array. this method will be executed during backtracking
        merge(array, first, second);
    }

    private static void merge(int[] array, int[] first, int[] second){
        int indexFirst = 0, indexSecond = 0, x = 0;  //initializing variables

        //comparing values of each array using while loop
        while(indexFirst < first.length && indexSecond < second.length){
            if(first[indexFirst] < second[indexSecond]){  //comparing values
                array[x] = first[indexFirst];  //adding smaller value to the main array
                indexFirst++;  //incrementing value
            }
            else{
                array[x] = second[indexSecond];  //adding smaller value to the main array
                indexSecond++;  //incrementing value
            }
            x++;  //incrementing the value of x
        }

        //checking if there are some leftover values in first array
        while(indexFirst < first.length){
            array[x] = first[indexFirst];  //adding leftover values to the array
            indexFirst++;  //incrementing index
            x++;  //incrementing value of x
        }

        //checking if there are some leftover values in second array
        while(indexSecond < second.length){
            array[x] = second[indexSecond];  //adding leftover values to the array
            indexSecond++;  //incrementing index
            x++;   //incrementing value of x
        }
    }
}
