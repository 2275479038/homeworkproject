package cn.com.test;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Project pro = new Project();
        pro.setCode("2018TB");
        Subproject sub = new Subproject();
        sub.setCode("2018TBS");
        sub.setName("name");
        sub.setBudget(654654d);
        pro.setSub(sub);

        Project pro1 = (Project)pro.clone();
        System.out.println(pro == pro1);
    }
}
