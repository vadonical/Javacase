package com.vadonical;

/**
 * Created by Zhenxian on 2017/6/1.
 */
class Sub {
    final String subName = "HelloWorld";
    final double fpi = 3.1415926;
}

public class TextConstant {
    int number = 10;

    public void run(Object obj) {
        System.out.println("是对象Object：" + obj);
    }

    public void run(Sub sub) {
        System.out.println("是类Sub：" + sub);
    }

    private void showObject() {
        Sub sub = new Sub();
        System.out.println("Sub.subName = " + sub.subName);
        System.out.println("Sub.fpi = " + sub.fpi);
    }

    public static void main(String[] args) {
        TextConstant constant = new TextConstant();
        constant.number = 5;
        System.out.println("t.i" + constant.number);
        constant.showObject();
        constant.run(null);
    }
}

