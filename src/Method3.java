public class Method3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(checkExist(arr, 3));
    }

    public static boolean checkExist(int[] arr, int number){
        for (int i : arr){
            if (i == number){
                return true;
            }
        }
        return false;
    }
}
