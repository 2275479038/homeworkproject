package cn.com.test;

public class Test {

    public static void main(String[] args) {
        GPer gper = GPer.getInstance();
        Teacher tom = new Teacher("Tom");
        Teacher mic = new Teacher("Mic");

        Question question = new Question();
        question.setUserName("小明");
        question.setContent("适配器模式适用于哪些场景？");

        gper.publishQuestion(question,mic);

    }

}
