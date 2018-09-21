package com.xiaochen.demo.dynamicDs;/*package com.iflashbuy.app.api.dynamicDs;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
public class DynamicDataSourceConfiguration {

	@Bean(name = "primaryDataSource")
	@Qualifier("primaryDataSource")
	@ConfigurationProperties(prefix = "spring.datasource.")
	public DataSource primaryDataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean(name = "secondaryDataSource")
	@Qualifier("secondaryDataSource")
	@Primary
	@ConfigurationProperties(prefix = "custom.datasource.")
	public DataSource secondaryDataSource() {
		return DataSourceBuilder.create().build();
	}

	public Map<String, DataSource> getDataSourceList() {
		Map<String, DataSource> dataSourceMap = new HashMap<>();
		dataSourceMap.put("primaryDataSource", primaryDataSource());
		dataSourceMap.put("secondaryDataSource", secondaryDataSource());
		
		DynamicDataSourceContextHolder.dataSourceList.addAll(dataSourceMap.keySet());
		return dataSourceMap;
	}

}
*/