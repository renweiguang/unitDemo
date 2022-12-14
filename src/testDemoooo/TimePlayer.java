package testDemoooo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class TimePlayer {
    public static void main(String[] args) {
        // 你活了多少天
        System.out.println("请输入你的生日，格式20001021");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String birthday = scanner.next();
            LocalDate birthdayDate = LocalDate.parse(birthday, DateTimeFormatter.ofPattern("yyyyMMdd"));

            LocalDate today = LocalDate.now();
            long days = birthdayDate.until(today, ChronoUnit.DAYS);
            System.out.println("你已经活了" + days + "天");
        }
    }
}
