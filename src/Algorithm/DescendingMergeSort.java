package Algorithm;

public class DescendingMergeSort {

    //sorting array using merge sort algorithm in descending order
    public DescendingMergeSort(){
        int[] array = {1,2,8,9,5,7,9,45,96,45,-1,-5,8,20,-21};  //creating an array

        sort(array);  //calling method to perform merge sort

        System.out.println();
        System.out.print("Descending Merge Sort: ");
        for(int x = 0;x<array.length;x++){
            System.out.print(array[x]+" ");
        }
    }


    private void sort(int array[]){
        if(array.length <= 1){
            return;
        }
        int[] first = new int[array.length/2];
        int[] second = new int[array.length - first.length];

        for(int x =0; x<first.length;x++){
            first[x] = array[x];
        }

        for(int x =0;x<second.length;x++){
            second[x] = array[first.length + x];
        }

        sort(first);
        sort(second);
        merge(first,second,array);
    }

    private void merge(int first[], int[] second, int[] array){
        int firstIndex = 0, secondIndex = 0, x = 0;

        while(firstIndex < first.length && secondIndex < second.length){
            if(first[firstIndex] > second[secondIndex]){
                array[x] = first[firstIndex];
                firstIndex++;
            }
            else{
                array[x] = second[secondIndex];
                secondIndex++;
            }
            x++;
        }

        while(firstIndex < first.length){
            array[x] = first[firstIndex];
            firstIndex++;
            x++;
        }

        while(secondIndex < second.length){
            array[x] = second[secondIndex];
            secondIndex++;
            x++;
        }
    }
}
