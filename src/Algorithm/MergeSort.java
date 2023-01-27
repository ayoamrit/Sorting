package Algorithm;

public class MergeSort{

    public MergeSort(){
        int[] array = {1,2,8,9,5,7,9,45,96,45,-1,-5,8,20,-21};
        sort(array);

        System.out.println();
        System.out.print("Merge Sort: ");
        for(int x = 0;x<array.length;x++){
            System.out.print(array[x]+" ");
        }
    }

    private static void sort(int[] array){

        if(array.length <= 1){
            return;
        }

        int[] first = new int[array.length / 2];
        int[] second = new int[array.length - first.length];

        for(int x = 0; x<first.length;x++){
            first[x] = array[x];
        }

        for(int x = 0; x<second.length;x++){
            second[x] = array[first.length + x];
        }

        sort(first);
        sort(second);
        merge(array, first, second);
    }

    private static void merge(int[] array, int[] first, int[] second){
        int indexFirst = 0, indexSecond = 0, x = 0;

        while(indexFirst < first.length && indexSecond < second.length){
            if(first[indexFirst] < second[indexSecond]){
                array[x] = first[indexFirst];
                indexFirst++;
            }
            else{
                array[x] = second[indexSecond];
                indexSecond++;
            }
            x++;
        }

        while(indexFirst < first.length){
            array[x] = first[indexFirst];
            indexFirst++;
            x++;
        }

        while(indexSecond < second.length){
            array[x] = second[indexSecond];
            indexSecond++;
            x++;
        }
    }
}
