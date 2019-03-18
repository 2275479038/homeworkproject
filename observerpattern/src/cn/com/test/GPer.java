package cn.com.test;

import com.google.common.eventbus.EventBus;

public class GPer {

    private String name = "GPer 生态圈";
    private static GPer gper = null;
    private GPer(){}
    public static GPer getInstance(){
        if(null == gper){
            synchronized(GPer.class){
                if(null == gper){
                    gper = new GPer();
                }
            }
        }
        return gper;
    }
    public String getName() {
        return name;
    }
    public void publishQuestion(Question question,Teacher t){
        System.out.println(question.getUserName() + "在" + this.name + "上提交了一个问题。");
        EventBus eventbus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();
        eventbus.register(guavaEvent);
        eventbus.post(t);
    }
}
