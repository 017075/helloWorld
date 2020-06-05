package helloWorld.controller;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author Zhao JianHong
 * @date 2020/6/5
 */
public class DoubleBall {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<String>();
        while (true) {
            double a = Math.random();
            System.out.println("随机数=" + a + "              随机数*33=" + a * 33 + "              随机数*33+1=" + ((int) (a * 33) + 1));
            // 获取33以内的数字
            int sui = (int) (a * 33) + 1;
            //将元素存入集合中
            set.add(sui < 10 ? "0" + sui : "" + sui);
            //存满六个红色球，则结束循环
            if (set.size() == 6) {
                break;
            }
        }
        // 获取16以内的数字
        Set<String> set2 = new TreeSet<String>();
        int sui2 = (int) (Math.random() * 16) + 1;
        set2.add(sui2 < 10 ? "0" + sui2 : "" + sui2);
        System.out.println("红球：" + set + " 蓝球：" + set2);
    }
}
