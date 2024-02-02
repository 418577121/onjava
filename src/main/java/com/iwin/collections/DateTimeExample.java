package com.iwin.collections;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {
    public static void main(String[] args) {
        // 输入的日期时间字符串
        String inputDateTimeString = "2024-02-08 08:00";

        // 定义输入日期时间的格式
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        // 将字符串解析为 LocalDateTime 对象
        LocalDateTime dateTime = LocalDateTime.parse(inputDateTimeString, inputFormatter);

        // 定义输出日期和时间的格式
        DateTimeFormatter outputDateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter outputTimeFormatter = DateTimeFormatter.ofPattern("HHmm");

        // 格式化日期和时间为字符串
        String formattedDate = dateTime.format(outputDateFormatter);
        String formattedTime = dateTime.format(outputTimeFormatter);

        // 输出结果
        System.out.println("Formatted Date: " + formattedDate);
        System.out.println("Formatted Time: " + formattedTime);
    }
}