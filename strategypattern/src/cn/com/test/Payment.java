package cn.com.test;

public abstract class Payment {

    public abstract String getName();

    protected abstract double queryBalance(String uid);

    public String pay(String uid,double amount){

        if(queryBalance(uid) < amount){
              return "failed";
        }else{
            return "OK";
        }
    }

}
