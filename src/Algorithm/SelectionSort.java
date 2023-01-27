package Algorithm;

public class SelectionSort implements Array{

    //selection sort is a method of sorting lists in Java in an order.
    //this method of sorting lists gets the smallest number in an array and swap it with the nth element
    //main problem with the selection sort is that it is unbalanced.
    public SelectionSort(){

        printUnsortedArray();  //printing unsorted array

        //using for loop to sort unsorted list
        for(int x =0;x<arrayLength;x++){
            int index = x;  //getting the index

            //using another for loop to compare the index with other elements in an array
            for(int y = x+1; y < arrayLength;y++){
               if(numberArray[index] > numberArray[y]){  //if any other element is smaller than the index provided above
                   index = y;  //then value of index would be changed to the smallest number index
               }
            }

            //after the all the index has been compared. we can swap the elements
            int smallestNumber = numberArray[index];  //getting the smallest number in an array
            numberArray[index] = numberArray[x];  //swapping the smallest index with another value
            numberArray[x] = smallestNumber;  //putting the smallest number to the front of an array
        }

        printArray();  //calling method to print array
    }

    private void printArray(){  //method printing array

        System.out.print("Selection Sort: ");
        //using for loop to print an array
        for(int x = 0;x<arrayLength;x++){
            System.out.print(numberArray[x]+" ");  //printing
        }
    }

    private void printUnsortedArray(){  //method printing array

        System.out.print("Unsorted Array: ");
        //using for loop to print an array
        for(int x = 0;x<arrayLength;x++){
            System.out.print(numberArray[x]+" ");  //printing
        }
        System.out.println();  //leaving a line
    }
}
