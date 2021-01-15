package com.vadonical;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Zhenxian on 2017/6/1.
 */
public class PrintCalendarOfAnyYear {
    static int year, monthDay, weekDay;

    public static boolean isLeapYear(int y) {
        return ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0));
    }

    public static int firstDay(int y) {
        long n = y * 365;
        for (int i = 1; i < y; i++)
            if (isLeapYear(i))
                n += 1;
        return (int) n % 7;
    }

    public static void printWeek() {
        System.out.println("=================== ======");
        System.out.println("日  一  二  三  四  五  六 ");
    }

    public static int getMonthDay(int m) {
        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                if (isLeapYear(year))
                    return 29;
                else
                    return 28;
            default:
                return 0;
        }
    }

    public static void printMonth() {
        for (int m = 1; m <= 12; m++) {
            System.out.println(m + "月");
            printWeek();
            for (int j = 1; j <= weekDay; j++) {
                System.out.print("  ");
            }
            int monthDay = getMonthDay(m);
            for (int d = 1; d <= monthDay; d++) {
                if (d < 10) {
                    System.out.print(d + "   ");
                } else {
                    System.out.print(d + "  ");
                }
                weekDay = (weekDay + 1) % 7;
                if (weekDay == 0)
                    System.out.println();
            }
            System.out.println("\n");
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.print("请输入一个年份：");
        InputStreamReader ir;
        BufferedReader in;
        ir = new InputStreamReader(System.in);
        in = new BufferedReader(ir);
        String s = in.readLine();
        year = Integer.parseInt(s);
        weekDay = firstDay(year);
        System.out.println("\n    " + year + "年       ");
        printMonth();
    }
}

