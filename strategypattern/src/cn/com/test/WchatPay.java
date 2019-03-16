package cn.com.test;

public class WchatPay extends Payment{
    @Override
    public String getName() {
        return "微信";
    }
    @Override
    protected double queryBalance(String uid) {
        return 500;
    }
}
