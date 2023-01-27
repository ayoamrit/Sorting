package Algorithm;

public class InsertionSort implements Array{

    //Insertion sort is a method to sort a list in java
    //it compares the value of nth element with (nth + 1) element & the bigger one is swapped with the smaller one
    //best case is: O(n)
    //worst case is: O(n^2)
    public InsertionSort(){

        //using for loop to perform insertion sort
        for(int x =0;x<arrayLength;x++){

            //using another for loop to compare smaller value with the bigger one
            for(int y = 0;y<arrayLength-1;y++){

                //if the nth element in an array is bigger than (nth + 1) swap would take place
                if(numberArray[y] > numberArray[y+1]){
                    int temp = numberArray[y+1];  //storing smaller value as temporary
                    numberArray[y+1] = numberArray[y]; //swapping values
                    numberArray[y] = temp;
                }
            }
        }

        printArray();  //calling method to print sorted array
    }

    private void printArray(){
        System.out.println();
        System.out.print("Insertion Sort: ");

        //using for loop to print the array
        for(int x = 0;x<arrayLength;x++){
            System.out.print(numberArray[x]+" ");  //printing
        }
    }
}
