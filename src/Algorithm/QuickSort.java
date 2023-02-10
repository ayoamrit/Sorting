package Algorithm;

public class QuickSort implements Array{

    public QuickSort(){

        printArray();
        System.out.println();  //leaving a line

        //calling and passing parameters to perform quick sort function
        sort(numberArray, 0, arrayLength-1);

        printArray();

    }

    private void sort(int[] array, int lowIndex, int highIndex){

        if(lowIndex >= highIndex){
            return;
        }

        //last element of the array is going to be the pivot
        int pivot = array[highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while(leftPointer < rightPointer){

            while(array[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }

            while(array[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }

            swap(array, leftPointer, rightPointer);
        }

        //swapping pivot
        swap(array, leftPointer, highIndex);

        sort(array, lowIndex, leftPointer-1);
        sort(array,leftPointer+1,highIndex);

    }

    private void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private void printArray(){
        for(int x = 0;x<arrayLength;x++){
            System.out.print(numberArray[x]+" ");
        }
    }

}
