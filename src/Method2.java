public class Method2 {
    public static void main(String[] args) {
        double[] arr = {1.1, 3, 22.9, 11};
        System.out.println(getMax(arr));
    }

    public static double getMax(double[] arr){
        double max = arr[0];
        for (double num : arr){
            if (num > max){
                max = num;
            }
        }

        return max;
    }
}
