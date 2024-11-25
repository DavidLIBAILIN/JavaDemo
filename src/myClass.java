import java.lang.reflect.Array;
import java.util.*;


public class myClass {
    public static void main(String[] args) {
        //1.定义一个统计变量,初始值为0
        int count = 0;

        //2.使用for循环获取所有的三位数
        for(int x=100; x<1000; x++) {
            //3.拆分三位数的百位,十位,个位
            int ge = x%10;
            int shi = x/10%10;
            int bai = x/10/10%10;

            //4.利用公式判断这个三位数是否为水仙花数,如果是,统计变量++
            if((ge*ge*ge+shi*shi*shi+bai*bai*bai) == x) {
                count = count + 1;
                System.out.println(x);
            }
        }

        //5.循环结束之后,打印统计结果
        System.out.println("水仙花数共有："+count+"个");
    }


}