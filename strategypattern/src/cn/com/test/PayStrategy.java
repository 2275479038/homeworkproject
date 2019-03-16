package cn.com.test;

import java.util.HashMap;
import java.util.Map;

public class PayStrategy {

    public static final String ZfbPay = "ZfbPay";
    public static final String WchatPay = "WchatPay";
    public static final String BankCardPay = "BankCardPay";

    private static Map<String,Payment> payStrategy = new HashMap<String,Payment>();

    static {
        payStrategy.put(ZfbPay,new ZfbPay());
        payStrategy.put(WchatPay,new WchatPay());
        payStrategy.put(BankCardPay,new BankCardPay());
    }

    public static Payment get(String payKey){
        if(!payStrategy.containsKey(payKey)){
            return payStrategy.get(BankCardPay);
        }
        return payStrategy.get(payKey);
    }

}
