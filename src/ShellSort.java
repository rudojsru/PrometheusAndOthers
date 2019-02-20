public class ShellSort {
    public static void main(String[] args) {
        int[] array = {30, 9,22, 54, 15, 14, 8, 2, 10, 4, 6, 1, 24, 42, 34, 19, 19, 7, 8};
      //  int[] array9  = {7, 6, 8, 9, 3, 2, 10 , 5, 1};
         int soother=0;
         int length=array.length;
             for (int i =length/2; i>0;  i=length/2 ) {
                for (int j =i; j <length ; j ++)
                 if (array[j] < array[j - i]) {
                     soother = array[j];
                     array[j] = array[j-i];
                     array[j-i] = soother;
                     for (int k=i; (k-2*i) >0; k--){
                         if(array[k-i]< array[k-2*i]);
                         soother=array[k-2*i];
                 }
             }
         }
    }
}