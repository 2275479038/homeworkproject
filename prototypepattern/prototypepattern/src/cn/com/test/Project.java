package cn.com.test;

import java.io.*;
/*
    原型模式（Prototype Pattern）是指原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
    原型模式主要适用于以下场景：
    1、类初始化消耗资源较多。
    2、new 产生的一个对象需要非常繁琐的过程（数据准备、访问权限等）
    3、构造函数比较复杂。
    4、循环体中生产大量对象时

 */
public class Project implements Serializable {

    private String code;

    private Subproject sub;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return this.deepClone();
    }

    public void setSub(Subproject sub) {
        this.sub = sub;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Subproject getSub() {
        return sub;
    }

    public String getCode() {
        return code;
    }

    private Project deepClone(){

        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            Project project = (Project)ois.readObject();

            return project;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Project shallowClone(Project project){
        Project pro = new Project();
        pro.code = project.code;
        pro.sub = project.sub;
        return pro;
    }

}
