public class newSorting{
    public void newSorting(int[] arry, int size){
        if(arry.length <= size)
            quickSort(arry, 0, arry.length-1);

        else{
            int[] left = new int[arry.length / 2];
            int[] right = new int[arry.length - left.length];

            for(int i=0; i<left.length; i++){
                left[i] = arry[i];
            }
            newSorting(left, size);

            for(int i=0; i<right.length; i++){
                right[i] = arry[i + left.length];
            }
            newSorting(right, size);

            mergeSortedHalves(arry, left, right);
        }
    }

    private void mergeSortedHalves(int[] arry, int[] left, int[] right){
        int i = 0;
        int j = 0;
        int index = 0;
        while(index < arry.length){

            if(i < left.length && j < right.length){
                if(left[i] < right[j]){
                    arry[index] = left[i];
                    i++;
                }

                else{
                    arry[index] = right[j];
                    j++;
                }
            }

            else{
                arry[index] = left[i];
                i++;
            }
            index++;
        }

        if(j < right.length){
            arry[index] = right[j];
            j++;
            index++;
        }
    }

    private void quickSort(int[] arry, int start, int end){
        if(start < end){
            int index = partition(arry, start, end);
            quickSort(arry, start, index - 1);
            quickSort(arry, index + 1, end);
        }
    }

    private int partition(int[] arry, int start, int end){
        int pivot = arry[start];
        int i = start;
        int temp;

        for(int j=start+1; j<=end; j++){
            if(arry[j] < pivot){
                i++;
                temp = arry[i];
                arry[i] = arry[j];
                arry[j] = temp;
            }
        }
        
        temp = arry[start];
        arry[start] = arry[i];
        arry[i] = temp;
        return i;
    }
}