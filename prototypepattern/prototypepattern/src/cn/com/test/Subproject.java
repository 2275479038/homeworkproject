package cn.com.test;

import java.io.Serializable;

public class Subproject implements Serializable {

    private String code;

    private String name;

    private double budget;

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBudget() {
        return budget;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
