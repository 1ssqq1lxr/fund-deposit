package com.somnus.deposit.support.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;

public class DateUtil {

	/**
	 * @Description: 获取当前系统日期 格式:yyyy-mm-dd
	 * @return String 日期字符串
	 * @throws
	 */
	public static String getCurrentDate() {
		return getCurrentDate("yyyy-MM-dd");
	}

	/**
	 * @Title: getDate
	 * @Description: 获取当前系统日期 格式:yyyymmdd
	 * @return String
	 * @throws
	 */
	public static String getDate() {
		return getCurrentDate("yyyyMMdd");
	}

	/**
	 * 
	 * @Description: 获取当前系统日期
	 * @param format
	 *            日期格式
	 * @return String 日期字符串
	 * @throws
	 */
	public static String getCurrentDate(String format) {
		return getCurrentDateTimeStr(format);
	}

	/**
	 * @Description: 获取当前系统时间 格式:HH:mm:ss
	 * @return String 时间字符串
	 * @throws
	 */
	public static String getCurrentTime() {
		return getCurrentDate("HH:mm:ss");
	}

	/**
	 * 
	 * @Description: 获取当前系统时间
	 * @param format
	 *            时间格式
	 * @return String 时间字符串
	 * @throws
	 */
	public static String getCurrentTime(String format) {
		return getCurrentDateTimeStr(format);
	}

	/**
	 * @Description: 获取当前系统时间戳 格式:yyyy-mm-dd HH:mm:ss
	 * @return String 时间字符串
	 * @throws
	 */
	public static String getCurrentTimeStamp() {
		return getCurrentDate("yyyy-MM-dd HH:mm:ss");
	}


	/**
	 * 
	 * @Description: 获取当前系统时间戳
	 * @param format
	 *            时间格式
	 * @return String 时间字符串
	 * @throws
	 */
	public static String getCurrentTimeStamp(String format) {
		return getCurrentDateTimeStr(format);
	}

	/**
	 * 
	 * @Description: 获取当前日期时间字符串
	 * @param format
	 *            日期时间格式
	 * @return String 日期时间字符串
	 * @throws
	 */
	public static String getCurrentDateTimeStr(String format) {
		DateFormat formater = new SimpleDateFormat(format);
		return formater.format(new Date());
	}

	/**
	 * @Title:sourcePlusInterval
	 * @Description:日期增加
	 * @param source
	 * @param interval
	 * @return
	 * @throws Exception
	 * @return String
	 */
	public static String sourcePlusInterval(String source, int interval) {
		DateFormat informater = new SimpleDateFormat("yyyy-MM-dd");
		Calendar calendar = Calendar.getInstance();
		try {
			calendar.setTime(informater.parse(source));
		} catch (ParseException e) {

		}
		int day = calendar.get(Calendar.DAY_OF_YEAR);
		calendar.set(Calendar.DAY_OF_YEAR, day + interval);
		return informater.format(calendar.getTime());
	}
	
	/**
	 * addMonth
	 * @Description:日期增加-周增加
	 * @param day
	 * @param amount
	 * @return
	 * @throws Exception
	 * @return String
	 */
	public static String addWeek(String day, int amount) {
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = sdf.parse(day);
		} catch (ParseException e) {
		}
		return sdf.format(DateUtils.addWeeks(date, amount));
	}
	
	
	/**
	 * addMonth
	 * @Description:日期增加-月增加
	 * @param day
	 * @param amount
	 * @return
	 * @throws Exception
	 * @return String
	 */
	public static String addMonth(String day, int amount) {
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = sdf.parse(day);
		} catch (ParseException e) {
		}
		return sdf.format(DateUtils.addMonths(date, amount));
	}
	
	/**
	 * addMonth
	 * @Description:日期增加-年增加
	 * @param day
	 * @param amount
	 * @return
	 * @throws Exception
	 * @return String
	 */
	public static String addYear(String day, int amount) {
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = sdf.parse(day);
		} catch (ParseException e) {
		}
		return sdf.format(DateUtils.addYears(date, amount));
	}
	

	/**
	 * 
	 * @Description: 将字符串从一种格式转化的
	 * @param @param source 日期原串
	 * @param @param infmt 日期输入格式
	 * @param @param outfmt 日期输出格式
	 * @param @return 目标日期字符串
	 * @throws java.text.ParseException
	 */
	public static String getFmtDate(String source, String infmt, String outfmt)
			throws ParseException {
		// 输入格式
		DateFormat informater = new SimpleDateFormat(infmt);
		// 输出格式
		DateFormat outfomater = new SimpleDateFormat(outfmt);

		return outfomater.format(informater.parse(source));
	}

	/**
	 * 
	 * @Description: 将字符串从一种格式转化的
	 * @param @param source 日期原串
	 * @param @param infmt 日期输入格式
	 * @param @param outfmt 日期输出格式
	 * @param @return 目标日期字符串
	 * @throws java.text.ParseException
	 */
	public static String getFmtDateStr(String source, String infmt,
			String outfmt) {
		String result = "";
		try {
			// 输入格式
			DateFormat informater = new SimpleDateFormat(infmt);
			// 输出格式
			DateFormat outfomater = new SimpleDateFormat(outfmt);

			result = outfomater.format(informater.parse(source));

		} catch (Exception e) {
			result = source;
		}

		return result;
	}
	/**
	 * 将日期转换为字符串
	 * @param source
	 * @param outfmt
	 * @return
	 */
	public static String getDateFmtStr(Date source,
			String outfmt) {
		String result = "";
		// 输出格式
		DateFormat outfomater = new SimpleDateFormat(outfmt);
		try {
			result = outfomater.format(source);
		} catch (Exception e) {
			result = outfomater.format(new Date());;
		}

		return result;
	}

	/**
	 * @Title:getAppointDay
	 * @Description:TODO(得到指定日期)
	 * @param @param num
	 * @param @param fmt
	 * @param @return 设定文件
	 * @return String
	 * @throws
	 * 
	 * @param num
	 * @param fmt
	 * @return
	 */
	public static String getAppointDay(String fmt, int num) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, num);
		Date tmp = calendar.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat(fmt);
		String date = sdf.format(tmp);
		return date;
	}
	
	public static long getBetweenDays(Date d1, Date d2){
		long n1 = d1.getTime();
		long n2 = d2.getTime();
		long diff = Math.abs(n1 - n2);
		diff /= 3600 * 1000 * 24;
		return diff;
	}

}
