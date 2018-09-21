package com.xiaochen.demo.dynamicDs;

import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
//@Order(value = -10)
@Component
public class DataSourceTargetAspect {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Before("@annotation(dataSourceTarget)")
	public void changeDataSource(JoinPoint point, DataSourceTarget dataSourceTarget) {
		String dsName = dataSourceTarget.name();
		logger.info("changeDataSource dsName:{},Signature:{}", dataSourceTarget.name(), point.getSignature());
		if (StringUtils.isBlank(dsName) || !DynamicDataSourceContextHolder.isContain(dsName)) {
			logger.info("未匹配到数据源名dsName:{},使用默认数据源", dsName);
		} else {
			logger.info("匹配,使用数据源名:{}", dsName);
			DynamicDataSourceContextHolder.setDataSource(dsName);
		}
	}

	@After("@annotation(dataSourceTarget)")
	public void clearDataSource(JoinPoint point, DataSourceTarget dataSourceTarget) {
		logger.info("clearDataSource dsName:{},Signature:{}", dataSourceTarget.name(), point.getSignature());
		// 方法执行完毕之后，销毁当前数据源信息，进行垃圾回收
		DynamicDataSourceContextHolder.clearCurDataSource();
	}
}
