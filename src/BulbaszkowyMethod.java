public class BulbaszkowyMethod {
    public static void main(String[] args) {
        int[] array = {30, 2, 51, 10, 4, 6, 20, 1, 5};
        int length = array.length;
        boolean flag = false;
        int next = 0;
        while (!flag) {
            flag = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    next = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = next;
                    flag = false;
                }
            }


        }
        for (int a : array) {
            System.out.print(a + " ");
        }
    }

}
