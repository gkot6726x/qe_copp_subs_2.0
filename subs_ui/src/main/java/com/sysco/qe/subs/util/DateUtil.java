package com.sysco.qe.subs.util;

import org.joda.time.DateTime;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import static java.time.format.DateTimeFormatter.ofPattern;

public class DateUtil {
    private static String datePattern1 = "yyyy-MM-dd";
    private static String datePattern2 = "yyyy_MM_dd";
    private static String datePatternWithTime = "yyyy-MM-dd 23:59:59";
    private static String datePattern3 = "MM/dd/yyyy";
    public static Boolean isDateEqual;

    private DateUtil() {
    }

    public static String getQcenterBuildDate() {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        String todayDate;
        SimpleDateFormat sdf = new SimpleDateFormat(datePattern2);
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        todayDate = sdf.format(calendar.getTime());
        return todayDate;
    }

    public static String formatDate(Date date, String format) {
        DateFormat formatter = new SimpleDateFormat(format);
        return formatter.format(date);
    }
    public static Date formDateBeforeSixMonths() {
        Date fromDateForSupportUser = new DateTime().minusMonths(6).toDate();
        return fromDateForSupportUser;
    }

    public static String getTodayDate() {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        String todayDate;
        SimpleDateFormat sdf = new SimpleDateFormat(datePattern1);
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        todayDate = sdf.format(calendar.getTime());
        return todayDate;
    }

    public static String getEndDateOfException() {
        return getEndDateOfException(datePattern1);
    }

    public static String getEndDateOfException(String datePattern) {
        String endDate;
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        int calDay = calendar.get(Calendar.DAY_OF_WEEK);

        if (calDay == 7) {
            calendar.add(Calendar.DATE, 8);
        } else if (calDay == 1) {
            calendar.add(Calendar.DATE, 7);
        } else {
            calendar.add(Calendar.DATE, (7 - (calDay - 1)));
        }
        SimpleDateFormat sdf = new SimpleDateFormat(datePattern);
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        endDate = sdf.format(calendar.getTime());
        return endDate;
    }

    public static String getStartDateOfException() {
        return getStartDateOfException(datePattern1);
    }

    public static String getStartDateOfException(String datePattern) {
        String startDate;
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        int calDay = calendar.get(Calendar.DAY_OF_WEEK);

        if (calDay == 1) {
            calendar.add(Calendar.DATE, 1);
        } else if (calDay == 7) {
            calendar.add(Calendar.DATE, 2);
        }

        SimpleDateFormat sdf = new SimpleDateFormat(datePattern);
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        startDate = sdf.format(calendar.getTime());
        return startDate;
    }

    public static String getCurrentWeekMonday() {
        Calendar c = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(datePattern1);
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        return sdf.format(c.getTime());
    }

    public static String getNextWeekSunday() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(datePattern1);
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        calendar.add(Calendar.DATE, 7);
        return sdf.format(calendar.getTime());
    }

    public static Timestamp getNextWeekSundayTimestamp() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        calendar.add(Calendar.DATE, 7);
        return new Timestamp(calendar.getTimeInMillis());
    }

    public static String getOneWeekBefore() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(datePatternWithTime);
        calendar.add(Calendar.DATE, -7);
        return sdf.format(calendar.getTime());

    }
    private static final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); //("yyyy-MM-dd HH:mm:ss");
    public static String substractDaysFromToDayDate(int days) {
        Date currentDate = new Date();
        // convert date to calendar
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, days); //same with c.add(Calendar.DAY_OF_MONTH, 1);
        // convert calendar to date
        Date currentDatePlusOne = c.getTime();
        String updatedDate = dateFormat.format(currentDatePlusOne).substring(0, 10);
        return (updatedDate);
    }

    public static String [] calculatePerticularDayInLastWeek() {
        DateTimeFormatter dtf = ofPattern("yyyy-MM-dd"); //
        LocalDateTime now = LocalDateTime.now();
        int millisMultiplier = getTodayDayInWeek();
        String fromDate = dtf.format(now);
        //split year, month and days from the date using StringBuffer.
        StringBuffer sBuffer = new StringBuffer(fromDate);
        String year = sBuffer.substring(2, 4);
        String mon = sBuffer.substring(5, 7);
        String dd = sBuffer.substring(8, 10);
        String modifiedFromDate = dd + '/' + mon + '/' + year;
        int startDate = 1000 * 60 * 60 * 24 * millisMultiplier;
        int endDate = 1000 * 60 * 60 * 24 * (millisMultiplier - 3);
        DateFormat newdateFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy");
        Date dateSelectedFrom = null;

        try {
            dateSelectedFrom = dateFormat.parse(modifiedFromDate);
        } catch (Exception e) {
            e.printStackTrace();
        }
        String endDateInDays = newdateFormat.format(dateSelectedFrom.getTime() - endDate);
        String startDateIsDays = newdateFormat.format(dateSelectedFrom.getTime() - startDate);
        String[] daysInWeek;
        return daysInWeek = new String[] {startDateIsDays,endDateInDays};
    }

    public static int getTodayDayInWeek() {
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        int millis = 0;
        switch (day) {
            case Calendar.SUNDAY:
                millis = 5;
                break;
            case Calendar.MONDAY:
                millis = 6;
                break;
            case Calendar.TUESDAY:
                millis = 7;
                break;
            case Calendar.WEDNESDAY:
                millis = 8;
                break;
            case Calendar.THURSDAY:
                millis = 9;
                break;
            case Calendar.FRIDAY:
                millis = 10;
                break;
            case Calendar.SATURDAY:
                millis = 11;
                break;
        }
        return millis;
    }
    public static int getCurrentWeekOfTheYear() {
        Calendar cal = Calendar.getInstance();
        return cal.get(Calendar.WEEK_OF_YEAR);
    }

    public static Date toDate(String date, String pattern) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        simpleDateFormat.setLenient(false);
        return simpleDateFormat.parse(date);

    }

    public static String toDate(Date date, String pattern) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        simpleDateFormat.setLenient(false);
        return simpleDateFormat.format(date);
    }

    public static String convertDateFormat(String oldFormat, String newFormat, String oldDateString) throws ParseException {
        String newDateString;
        SimpleDateFormat sdf = new SimpleDateFormat(oldFormat);
        Date d = sdf.parse(oldDateString);
        sdf.applyPattern(newFormat);
        newDateString = sdf.format(d);
        return newDateString;
    }

    public static String getNextWeekGivenDay(String day) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(datePattern3);
        switch (day) {
            case "MONDAY":
                calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
                calendar.add(Calendar.DATE, 7);
                break;
            case "TUESDAY":
                calendar.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);
                calendar.add(Calendar.DATE, 7);
                break;
            case "WEDNESDAY":
                calendar.set(Calendar.DAY_OF_WEEK, Calendar.WEDNESDAY);
                calendar.add(Calendar.DATE, 7);
                break;
            case "THURSDAY":
                calendar.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
                calendar.add(Calendar.DATE, 7);
                break;
            case "FRIDAY":
                calendar.set(Calendar.DAY_OF_WEEK, Calendar.FRIDAY);
                calendar.add(Calendar.DATE, 7);
                break;
            case "SATURDAY":
                calendar.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
                calendar.add(Calendar.DATE, 7);
                break;
            default:
                calendar.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
                calendar.add(Calendar.DATE, 14);
                break;
        }
        return sdf.format(calendar.getTime());
    }

    public static String addDaysToGivenDate(int days, String dateFrom) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat(datePattern3);
        Calendar c = Calendar.getInstance();
        c.setTime(formatter.parse(dateFrom));
        c.add(Calendar.DAY_OF_MONTH, days);
        return formatter.format(c.getTime());
    }

    public static String getCurrentWeekSunday() {
        Calendar c = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(datePattern1);
        c.set(Calendar.DAY_OF_WEEK, Calendar.SATURDAY);
        c.add(Calendar.DATE, 1);
        return sdf.format(c.getTime());
    }
    public static String getNextWeekMonday() {
        Calendar c = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat(datePattern1);
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        c.add(Calendar.DATE, 7);
        return sdf.format(c.getTime());
    }

    public static boolean verifyGivenDayIsEqualWithCurrentDate(String DBReturnedDate) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date todayDate = new Date();
        if (dateFormat.format(todayDate).equals(dateFormat.format(dateFormat.parse(DBReturnedDate)))) {
            isDateEqual = true;
        } else {
            isDateEqual = false;
        }
        return isDateEqual;
    }
}
