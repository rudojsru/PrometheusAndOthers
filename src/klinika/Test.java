package klinika;

public class Test {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] array = {30, 9, 15, 14,8, 2, 10, 4, 6, 1, 24, 42, 34, 19, 19};
        int length = array.length;
        for (int l=length/2; l > 0; l = l/2){
            for (int i=l; i < length; i++){
                if (array[i]<array[i-l]){
                    int exchange=array[i];
                    array[i]=array[i-l];
                    int w = array[i-l];
                    array[i-l]=exchange;
                    for(int k=i; (k-2*l)>=0 ; k--)
                        if ((array[k-l]) < array[k-2*l]){
                            exchange = array[k-2*l];
                            array[k-2*l]=array[k-1];
                            w = array[k-2*l];
                            array[k-1]=exchange;
                        }
                }


            }

        }

        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

