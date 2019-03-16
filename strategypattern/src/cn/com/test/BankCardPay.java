package cn.com.test;

public class BankCardPay extends Payment{
    @Override
    public String getName() {
        return "银行卡";
    }

    @Override
    protected double queryBalance(String uid) {
        return 200;
    }
}
