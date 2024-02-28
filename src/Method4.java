public class Method4 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 76, 1, 1, 3};
        int[] array = copyOfRange(arr, 3, 5);

        for (int j : array) System.out.println(j);
    }

    public static int[] copyOfRange(int[] arr, int from, int to){
        int[] new_arr = new int[to - from + 1];
        int k = 0;
        for (int i = from; i <= to; i++){
            new_arr[k++] = arr[i];
        }

        return new_arr;
    }
}
