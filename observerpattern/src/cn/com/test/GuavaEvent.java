package cn.com.test;

import com.google.common.eventbus.Subscribe;

public class GuavaEvent {

    @Subscribe
    public void subscribe(Teacher t){
        System.out.println(t.getName()+"老师你好:你有一个提问需要回答！");
    }
}
