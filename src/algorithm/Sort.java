package algorithm;

public class Sort {

    package algorithm;

    public class Sort {

        long executionTime = 0;
        /*
         * Please implement all the sorting algorithm. Feel free to add helper methods.
         * Store all the sorted data into one of the databases.
         */


        public int[] selectionSort(int [] array){
            final long startTime = System.currentTimeMillis();
            int [] list = array;
            @@ -34,7 +27,16 @@
            public int[] insertionSort(int [] array){
                final long startTime = System.currentTimeMillis();
                int [] list = array;
                //implement here

                for(int j=1;j<array.length-1;j++){
                    int curr= j;ray[min])
                    int j=i;
                    while(j>0 && curr<a[j-1]){
                        a[j]=a[j-1];
                        j--;
                    }
                    a[j]=curr;
                }

                min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int [] array){
        final long startTime = System.currentTimeMillis();
        int [] list = array;
        //implement here



        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] bubbleSort(int [] array){
        int [] list = array;
        //implement here

        
        
        return list;
    }
    

    public int [] mergeSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }
    

    public int [] quickSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }
    
    public int [] heapSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }


    public int [] bucketSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }
    
    public int [] shellSort(int [] array){
        int [] list = array;
        //implement here
        
        

        return list;
    }

    public static void printSortedArray(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
