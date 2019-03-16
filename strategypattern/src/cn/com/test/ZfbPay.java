package cn.com.test;

public class ZfbPay extends Payment {
    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    protected double queryBalance(String uid) {
        return 1000;
    }
}
