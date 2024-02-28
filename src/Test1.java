import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票的原价");
        int rawPrice = sc.nextInt();
        System.out.println("请输入月份");
        int month = sc.nextInt();
        System.out.println("请输入头等舱还是经济舱 0 头等舱 1 经济舱");
        int seat = sc.nextInt();

        double price = 0;
        if(5 <= month && month <= 10){//旺季
            price = getPrice(seat, price, 0.9, rawPrice, 0.85);
        }else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)){
            price = getPrice(seat, price, 0.7, rawPrice, 0.65);
        }else {
            System.out.println("非法月份");
        }

        System.out.println(price);
    }

    private static double getPrice(int seat, double price, double x, int rawPrice, double x1) {
        if (seat == 0) {
            price = x * rawPrice;
        } else if (seat == 1) {
            price = x1 * rawPrice;
        } else {
            System.out.println("非法座位");
        }
        return price;
    }
}
