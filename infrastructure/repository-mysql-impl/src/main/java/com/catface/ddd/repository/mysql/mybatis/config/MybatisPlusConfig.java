package com.catface.ddd.repository.mysql.mybatis.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.autoconfigure.ConfigurationCustomizer;
import com.baomidou.mybatisplus.core.MybatisConfiguration;
import com.baomidou.mybatisplus.core.injector.DefaultSqlInjector;
import com.baomidou.mybatisplus.core.injector.ISqlInjector;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.OptimisticLockerInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.pagination.dialects.MySqlDialect;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author catface
 * @since 2020/4/26
 */
@Configuration
@EnableTransactionManagement
@MapperScan("com.catface.ddd.repository.mysql.mybatis.mapper*")
public class MybatisPlusConfig {


  /**
   * 新的分页插件,一缓和二缓遵循mybatis的规则,需要设置 MybatisConfiguration#useDeprecatedExecutor = false
   * 避免缓存出现问题(该属性会在旧插件移除后一同移除)
   */
  @Bean
  public MybatisPlusInterceptor mybatisPlusInterceptor() {
    MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
    interceptor.addInnerInterceptor(paginationInterceptor());
    return interceptor;
  }

  @Bean
  public ConfigurationCustomizer configurationCustomizer() {
    return configuration -> configuration.setUseDeprecatedExecutor(false);
  }

  /**
   * * * 分页插件，自动识别数据库类型 * 多租户，请参考官网【插件扩展】
   */
  @Bean
  public PaginationInnerInterceptor paginationInterceptor() {

    PaginationInnerInterceptor paginationInnerInterceptor = new PaginationInnerInterceptor();
    // 设置请求的页面大于最大页后操作， true调回到首页，false 继续请求  默认false
    paginationInnerInterceptor.setOverflow(false);
    // 设置最大单页限制数量，默认 500 条，-1 不受限制
    paginationInnerInterceptor.setMaxLimit(500L);
    paginationInnerInterceptor.setDbType(DbType.MYSQL);
    paginationInnerInterceptor.setDialect(new MySqlDialect());
    return paginationInnerInterceptor;
  }

  /**
   * 开启逻辑删除
   */
  @Bean
  @ConditionalOnClass(MybatisConfiguration.class)
  public ISqlInjector sqlInjector() {
    return new DefaultSqlInjector();
  }

  /**
   * 使用乐观锁
   */
  @Bean
  @ConditionalOnClass(MybatisConfiguration.class)
  public OptimisticLockerInnerInterceptor optimisticLockerInterceptor() {
    return new OptimisticLockerInnerInterceptor();
  }
}
