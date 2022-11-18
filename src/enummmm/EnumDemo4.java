package enummmm;

import static enummmm.Color.*;

enum Color {GREEN, RED, BLUE}

public class EnumDemo4 {

    public static void printName(Color color) {
        switch (color) {
            case BLUE: //无需使用Color进行引用
                System.out.println("蓝色");
                break;
            case RED:
                System.out.println("红色");
                break;
            case GREEN:
                System.out.println("绿色");
                break;
        }
    }

    public static void main(String[] args) {

        printName(BLUE);
        printName(RED);
        printName(GREEN);

        //蓝色
        //红色
        //绿色
    }
}
