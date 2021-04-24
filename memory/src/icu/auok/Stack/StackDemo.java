package icu.auok.Stack;
/**
 * @author lixq
 * @date: 2021/4/24 23:48
 */
public class StackDemo {
    public static void main(String[] args) {
        method1();
    }
    private static void method1() {
        method2(1,2);
    }
    private static int method2(int a, int b) {
        int c = a + b;
        return c;
    }
}
