package cn.com.jandar.utils;

import java.util.Calendar;
import java.util.Date;

public class DateUtils {
	
	public static Date getNowTime(){
		Calendar calendar = Calendar.getInstance();
		return calendar.getTime();
	}
	/**
	 * 返回前一天
	 * @param nowtime
	 * @return
	 */
	public static Date lastDay(Date nowtime){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(nowtime);
		calendar.set(Calendar.DAY_OF_YEAR, -1);
		return calendar.getTime();
	}
	
	/**
	 * 返回前num天
	 * @param nowtime
	 * @param daynum
	 * @return
	 */
	public static Date fewDay(Date nowtime, Integer daynum){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(nowtime);
		calendar.set(Calendar.DAY_OF_YEAR, -daynum);
		return calendar.getTime();
	}

}
