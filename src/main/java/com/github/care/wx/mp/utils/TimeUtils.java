package com.github.care.wx.mp.utils;

import org.apache.commons.lang3.StringUtils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

/**
 * Time Utility for zizhuan mall
 *
 * @author daniel.lee
 * @since JDK1.8.0
 */
public class TimeUtils {

    private static final int FIVE_SECONDS = 59;

    public static final int NO_PAY_OFF_MINUTE = -120;
    public static final int DELIVERY_DAY = -10;

    public static Date currentTime() {
        return new Date();
    }

    private static String formatLocalDate(final LocalDate date, final String pattern) {
        return date.format(DateTimeFormatter.ofPattern(pattern));
    }

    public static String formatCurrentLocalDate(final String pattern) {
        if (StringUtils.isBlank(pattern)) {
            return null;
        }
        return formatLocalDate(LocalDate.now(), pattern);
    }

    private static String formatLocalTime(final LocalTime date, final String pattern) {
        return date.format(DateTimeFormatter.ofPattern(pattern));
    }

    public static String formatCurrentLocalTime(final String pattern) {
        if (StringUtils.isBlank(pattern)) {
            return null;
        }
        return formatLocalTime(LocalTime.now(), pattern);
    }

    private static String formatLocalDateTime(final LocalDateTime dateTime, final String pattern) {
        return dateTime.format(DateTimeFormatter.ofPattern(pattern));
    }

    public static String formatCurrentLocalDateTime(final String pattern) {
        if (StringUtils.isBlank(pattern)) {
            return null;
        }
        return formatLocalDateTime(LocalDateTime.now(), pattern);
    }
    public static Date findSomeDayAgoZeroTime(int day){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        if(day-1>0){
            calendar.add(Calendar.DAY_OF_MONTH, -(day-1));
        }
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        return calendar.getTime();
    }

    public static Date findSomeDayAddTime(Date date, int day){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, day);
        return calendar.getTime();
    }

    public static Date findTimeAddMinute(Date date, int minute){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MINUTE, minute);
        return calendar.getTime();
    }
    public static Date findZeroTimeAddMinute(Date date, int minute){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MINUTE, minute);
        calendar.add(Calendar.SECOND, FIVE_SECONDS);
        calendar.set(Calendar.SECOND, 0);
        return calendar.getTime();
    }
    public static Date findZeroSomeDayAddTime(Date date, int day){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, day);
        calendar.add(Calendar.SECOND, FIVE_SECONDS);
        calendar.set(Calendar.SECOND, 0);
        return calendar.getTime();
    }
}
