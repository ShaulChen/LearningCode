import java.util.Random;

public class Test4 {
    // 评委打分
    public static void main(String[] args) {
        /*
            去掉最高分和最低分，6个评委求平均值
         */
        int[] grades = new int[6];
        Random r = new Random();
        for (int i = 0; i < grades.length; i++){
            grades[i] =  r.nextInt(100);
            System.out.println(grades[i]);
        }

        System.out.println(getGrade(grades));


    }

    public static int getGrade(int[] grades){
        int min = grades[0], max = grades[0];

        for (int grade : grades){
            if (grade > max) max = grade;
            if (grade < min) min = grade;
        }
        System.out.println(max + " " + min);

        int result = 0;
        for (int grade : grades){
            if(grade != min && grade != max){
                result += grade;
            }
        }

        return result / 4;
    }
}
