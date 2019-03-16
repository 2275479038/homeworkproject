package cn.com.test;

public class Test {

    public static void main(String[] args) {
        IUserDao dao = new UserServiceImpl();
        User user = new User();
        user.setName("Mic");
        user.setAge(18);
        IUserDao daop = (IUserDao)new DynamicProxy().bind(dao);
        daop.add(user);
    }
}
