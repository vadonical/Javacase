package com.vadonical;

/**
 * Created by Zhenxian on 2017/6/1.
 */
public class BasicTypeChang {
    private void typeAutoUpgrade() {
        byte b = 44;
        char c = 'b';
        short s = 1024;
        int i = 4000;
        long l = 40000;
        float f = 35.67f;
        double d = 3.1234d;
        double result = (f * b) + (l * f) + (i / c) - (d * s);
        System.out.print("结果：" + result + "=");
        System.out.println((f * b) + "+" + (l * f) + "+" + (i / c) + "-" + (d * s));
    }

    private void autoChange() {
        char c = 'a';
        byte b = 44;
        short s0 = b;
        int i0 = s0;
        int i1 = c;
        long l = i0;
        float f = l;
        double d = f;
        float f1 = 1.7f;
        double dou = f1;
        System.out.println("f1 = " + f1 + ";dou = " + dou);
        f1 = (float) dou;
        System.out.println("f1 = " + f1 + ";dou = " + dou);
    }

    private void forceChange() {
        double d = 123.456d;
        float f = (float) d;
        long l = (long) d;
        int i = (int) d;
        short s = (short) d;
        byte b = (byte) d;
        System.out.print("d = " + d + ";f = " + f + ";l = " + l);
        System.out.print(";i = " + i + ";s = " + s + ";b = " + b);
        d = 567.89d;
        b = (byte) d;
        System.out.println("d = " + d + ";b = " + b);
    }

    public static void main(String[] args) {
        BasicTypeChang basicTypeChang = new BasicTypeChang();
        basicTypeChang.typeAutoUpgrade();
        basicTypeChang.autoChange();
        basicTypeChang.forceChange();
    }
}
