package com.xiaochen.demo.dynamicDs;

import java.util.ArrayList;
import java.util.List;

public class DynamicDataSourceContextHolder {

	//动态数据源注册时才add数据源进去
	public static List<String> dataSourceList = new ArrayList<>();

	private static final ThreadLocal<String> contextHolder = new ThreadLocal<>();

	public static String getDataSource() {
		return contextHolder.get();
	}

	public static void setDataSource(String dataSource) {
		contextHolder.set(dataSource);
	}
	
	public static void clearCurDataSource() {
		contextHolder.remove();
	}
	
	public static boolean isContain(String dataSource) {
		return dataSourceList.contains(dataSource);
	}
	
}
