package com.luhanlin.designpattern.chain_of_responsibility;

/**
 * 类详细描述：
 *
 * @author Mr_lu
 * @version 1.0
 * @mail allen_lu_hh@163.com
 * 创建时间：2018/11/16 1:16 PM
 */
public abstract class Support {

    private String name;
    private Support next;

    public Support(String name) {
        this.name = name;
    }

    // 转交给下一个链路进行处理
    public Support setNext(Support support){
        this.next = support;
        return support;
    }

    public final void support(Trouble trouble){
        if (resolve(trouble)){
            done(trouble);
        } else if (next != null){
            next.support(trouble);
        } else {
            fail(trouble);
        }
    }

    private void fail(Trouble trouble) {
        System.out.println(trouble + " cannot be resolved .");
    }

    protected void done(Trouble trouble){
        System.out.println(trouble + " is resolved by " + this + " .");
    }

    protected abstract boolean resolve(Trouble trouble);

    @Override
    public String toString() {
        return "[" + name + "]";
    }
}
