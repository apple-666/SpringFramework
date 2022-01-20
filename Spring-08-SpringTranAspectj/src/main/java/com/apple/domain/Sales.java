package com.apple.domain;

/**
 * @Author Double_apple
 * @Date 2022/1/20 15:47
 * @Version 1.0
 */
public class Sales {

    private int id;
    private int gid;
    private int nums;

    public Sales(){}

    public Sales(int id, int gid, int nums) {
        this.id = id;
        this.gid = gid;
        this.nums = nums;
    }

    @Override
    public String toString() {
        return "Sales{" +
                "id=" + id +
                ", gid=" + gid +
                ", nums=" + nums +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public int getNums() {
        return nums;
    }

    public void setNums(int nums) {
        this.nums = nums;
    }
}
