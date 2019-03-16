package cn.com.test;

public class UserServiceImpl implements IUserDao{
    @Override
    public void add(User user) {
        System.out.println("添加学生成功!");
    }
}
