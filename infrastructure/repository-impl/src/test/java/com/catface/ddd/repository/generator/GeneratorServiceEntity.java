package com.catface.ddd.repository.generator;

import static com.baomidou.mybatisplus.annotation.IdType.ASSIGN_ID;
import static com.baomidou.mybatisplus.generator.config.rules.DateType.ONLY_DATE;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.TemplateConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.Test;

/**
 * <p>
 * 测试生成代码
 * </p>
 *
 * @author K神
 * @since 2017/12/18
 */
public class GeneratorServiceEntity {

  private final String outPutDir = "./src/main/java";
  private final String packageName = "com.catface.ddd.repository.mybatis";
  private final String driver = "com.mysql.cj.jdbc.Driver";
  private final Boolean serviceNameStartWithI = false;
  private final String author = "catface";
  private String dbUrl = "jdbc:mysql://192.168.162.57:3306/utp?useUnicode=true&characterEncoding=utf8&serverTimezone=Asia/Shanghai";
  private String userName = "root";
  private String password = "catface996";

  @Test
  public void generateAllCode() {
    generateByTables(serviceNameStartWithI, packageName, "sub_order");
  }

  @Test
  public void generateOnlyEntity() {
    generateEntity(serviceNameStartWithI, packageName, "sub_order");
  }

  private void generateEntity(boolean serviceNameStartWithI, String packageName,
      String... tableNames) {
    GlobalConfig config = new GlobalConfig();
    DataSourceConfig dataSourceConfig = new DataSourceConfig();
    dataSourceConfig.setDbType(DbType.MYSQL)
        .setUrl(dbUrl).setUsername(userName)
        .setPassword(password)
        .setDriverName(driver);

    StrategyConfig strategyConfig = new StrategyConfig();
    strategyConfig.setCapitalMode(false)
        .setEntityLombokModel(true)
        .setControllerMappingHyphenStyle(true)
        .setNaming(NamingStrategy.underline_to_camel)
        .setColumnNaming(NamingStrategy.underline_to_camel)
        .setInclude(tableNames)
        .setEntityColumnConstant(false);

    //修改替换成你需要的表名，多个表名传数组
    config.setActiveRecord(false)
        .setOpen(false)
        .setAuthor(author)
        .setOutputDir(outPutDir)
        .setDateType(ONLY_DATE)
        .setIdType(ASSIGN_ID)
        .setFileOverride(true)
        .setEnableCache(true)
        .setControllerName(null)
        .setEnableCache(false)
        .setBaseColumnList(true)
        .setBaseResultMap(false)
        .setSwagger2(true);

    if (!serviceNameStartWithI) {
      config.setServiceName("%sRepository");
      config.setServiceImplName("%sRepositoryImpl");
    }

    TemplateConfig tc = new TemplateConfig();
    //不生成controller,service,mapper,xml,仅生成实体
    tc.setController(null);
    tc.setService(null);
    tc.setServiceImpl(null);
    //tc.setMapper(null);
    //tc.setXml(null);
    //tc.setEntity("templates/custom.entity.java.vm");
    tc.setEntity(null);
    new AutoGenerator()
        .setGlobalConfig(config)
        .setDataSource(dataSourceConfig)
        .setStrategy(strategyConfig)
        .setTemplate(tc)
        .setPackageInfo(new PackageConfig()
            .setParent(packageName)
            .setService("repository")
            .setServiceImpl("repository.impl")
            .setMapper("mapper")
            .setXml("mapper")
            .setEntity("entity"))
        .execute();
  }

  private void generateByTables(boolean serviceNameStartWithI, String packageName,
      String... tableNames) {

    GlobalConfig config = new GlobalConfig();
    DataSourceConfig dataSourceConfig = new DataSourceConfig();
    dataSourceConfig.setDbType(DbType.MYSQL)
        .setUrl(dbUrl).setUsername(userName)
        .setPassword(password)
        .setDriverName(driver);

    StrategyConfig strategyConfig = new StrategyConfig();
    strategyConfig.setCapitalMode(false)
        .setEntityLombokModel(true)
        .setControllerMappingHyphenStyle(true)
        .setNaming(NamingStrategy.underline_to_camel)
        .setColumnNaming(NamingStrategy.underline_to_camel)
        .setInclude(tableNames)
        .setEntityColumnConstant(false)
        .setLogicDeleteFieldName("del")
        .setVersionFieldName("version");

    //修改替换成你需要的表名，多个表名传数组
    config.setActiveRecord(false)
        .setOpen(false)
        .setAuthor(author)
        .setOutputDir(outPutDir)
        .setDateType(ONLY_DATE)
        .setIdType(ASSIGN_ID)
        .setEnableCache(true)
        .setFileOverride(true)
        .setControllerName(null)
        .setEnableCache(false)
        .setBaseColumnList(true)
        .setBaseResultMap(false)
        .setSwagger2(true);

    if (!serviceNameStartWithI) {
      config.setServiceName("%sRepository");
      config.setServiceImplName("%sRepositoryImpl");
    }

    TemplateConfig tc = new TemplateConfig();
    //不生成controller,service
    tc.setController(null);
    //tc.setService(null);
    //tc.setServiceImpl(null);
    new AutoGenerator()
        .setGlobalConfig(config)
        .setDataSource(dataSourceConfig)
        .setStrategy(strategyConfig)
        .setTemplate(tc)
        .setPackageInfo(new PackageConfig()
            .setParent(packageName)
            .setEntity("entity")
            .setMapper("mapper")
            .setXml("mapper")
            .setService("repository")
            .setServiceImpl("repository.impl")
        ).execute();

  }

}
