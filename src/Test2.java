public class Test2 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 101; i <= 200; i++){
            if (checkNumber(i)) count++;
        }

        System.out.println(count);
    }

    public static boolean checkNumber(int number){
        for (int i = 2; i < number; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
