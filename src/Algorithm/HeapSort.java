package Algorithm;

public class HeapSort {
    //the heapsort sorting algorithm follows O(nlogn) time complexity because the logn operations are occurring n times
    //heapsort is not stable because the operations in the heap can change the position of equivalent elements in an array
    public HeapSort(){
        int[] array = {1,5,8,456,5,4,6,4,8,13,31,844,16,-1};  //array of integers
        int arrayLength = array.length;  //length of the array

        //printing unsorted array
        printArray(array);

        //creating the binary tree using heapify method
        for(int x = (arrayLength/2)-1; x >= 0 ;x--){
            heapify(array,arrayLength,x);  //calling method
        }

        //sorting the array after creating the binary tree
        for(int x = arrayLength - 1; x >= 0;x--){
            swap(array,x,0);   //swapping children with the root parent

            //sorting using heapify method
            heapify(array,x, 0);
        }

        //printing sorted array
        printArray(array);
    }

    private void heapify(int[] array, int length, int x){
        //variable x is basically the parent
        int largest = x;
        int leftChild = (2*x)+1;  //formula for the left child
        int rightChild = (2*x)+2;  //formula for the right child

        //note: in order to sort the array in ascending order change the greater than symbols with less than
        //symbols in if statement

        //if the leftChild is smaller than the length of the array &&
        //if the leftChild element of the array is greater than its parent element
        if(leftChild < length && array[leftChild] > array[largest]){
            largest = leftChild;
        }

        //if the rightChild is smaller than the length of the array &&
        //if the rightChild element of the array is greater than its parent element
        if(rightChild < length && array[rightChild] > array[largest]){
            largest = rightChild;
        }

        //if the variable is not same as the variable
        //it means that either leftChild array element or rightChild array element is greater than the parent array element
        if(largest != x){
            swap(array, largest, x);  //swapping the greater value with the smaller value

            //calling method again to further check whether the parent is greater than its children or not
            heapify(array,length,largest);
        }
    }

    //method swapping elements of the array
    private void swap(int[] array, int index1, int index2){

        //swapping index1 with index2
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    //method printing the array
    private void printArray(int[] array){
        for(int x =0;x<array.length;x++){
            System.out.print(array[x]+" ");
        }
        System.out.println();  //leaving a line
    }
}
