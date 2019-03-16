package cn.com.test;

public class Test {

    public static void main(String[] args) {
        Order order = new Order("001","11111111",600);
        System.out.println(order.pay(PayStrategy.ZfbPay));
    }
}
