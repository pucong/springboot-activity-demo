package com.pc.activity.config;

import org.activiti.spring.SpringAsyncExecutor;
import org.activiti.spring.SpringProcessEngineConfiguration;
import org.activiti.spring.boot.AbstractProcessEngineAutoConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;
import java.io.IOException;

/**
 * 声名为配置类，继承Activity抽象配置类
 */
@Configuration
public class ActivityConfig extends AbstractProcessEngineAutoConfiguration {

    @Autowired
    DataSource DataSource;//注入配置好的数据源

    @Autowired
    PlatformTransactionManager platformTransactionManager;//注入配置好的事物管理器

    /**
     * 注入数据源和事务管理器
     * @param springAsyncExecutor
     * @return
     * @throws IOException
     */
    @Bean
    public SpringProcessEngineConfiguration springProcessEngineConfiguration(SpringAsyncExecutor springAsyncExecutor) throws IOException {
        return this.baseSpringProcessEngineConfiguration(DataSource, platformTransactionManager, springAsyncExecutor);
    }
}
