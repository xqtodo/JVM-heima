package icu.auok.Stack;
/**
 * @author lixq
 * @date: 2021/4/24 23:46
 */
public class ThreadSafety {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append(4);
        sb.append(5);
        sb.append(6);
        new Thread(()->m2(sb)).start();
    }
    /*
    *@Param
    *@Return void
    *线程安全：局部变量，没有逃离方法作用范围
    **/
    public static void m1(){
        StringBuilder sb = new StringBuilder();
        sb.append(1);
        sb.append(2);
        sb.append(3);
        System.out.println(sb);
    }
    /*
    *@Param [sb]
    *@Return void
    * 线程不安全，不是线程私有的，两个线程都使用这个对象
    * 主方法线程调用了这个新创建的线程里面的m2对象
    **/
    public static void m2(StringBuilder sb){
        sb.append(1);
        sb.append(2);
        sb.append(3);
        System.out.println(sb);
    }
    /*
    *@Param []
    *@Return java.lang.StringBuilder
    * 线程不安全，将对象返回了，逃离了方法的作用域，其他的线程有可能拿到这个对象
    **/
    public static StringBuilder m3(){
        StringBuilder sb = new StringBuilder();
        sb.append(1);
        sb.append(2);
        sb.append(3);
        return sb;
    }
}
