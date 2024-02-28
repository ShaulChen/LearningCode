import java.util.Arrays;
import java.util.Random;

public class Test3 {
    // 生成验证码
    public static void main(String[] args) {
        System.out.println(getRandomStr());
    }

    public static String getRandomStr(){
        char[] chs = new char[52];
        String result = "";

        for (int i = 0; i < chs.length; i++){
            if(i <= 25) chs[i] = (char)(97 + i);
            else chs[i] = (char)(65 + i - 26);
        }

        Random r = new Random();
        for (int i = 0; i < 4; i++){
            int index = r.nextInt(chs.length);
            result += chs[index];
        }

        int index = r.nextInt(10);

        return result + index;
    }
}
