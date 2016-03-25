package cn.com.jandar.utils;

public class StringUtils {
	
	/**
	 * 判断是否空字符串
	 * @param str
	 * @return
	 */
	public static Boolean isNull(String str){
		if(null==str||str.isEmpty()){
			return true;
		}
		return false;
	}
	
	/**
	 * 去空格
	 * @param str
	 * @return
	 */
	public static String trim(String str){
		return str.trim().replaceAll("\\s", "");
	}
}
