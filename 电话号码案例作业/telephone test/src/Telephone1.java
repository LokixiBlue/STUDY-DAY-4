import java.util.Scanner;

public class Telephone1 {
    public static void main(String[] args) {
        System.out.println("请输入手机号码");
        //从键盘键入值
        Scanner sc = new Scanner(System.in);
        //变量去接收键盘的值
        String phone = sc.next();
        //用substring函数，将phone变量中的值，截取第六位到第十一位，用6与被截取的值拼接
        String shortNum = 6 + phone.substring(6, 11);
        //输出拼接后的值
        System.out.println("手机号码" + phone + "的短号码是：" + shortNum);
        sc.close();
    }
}
