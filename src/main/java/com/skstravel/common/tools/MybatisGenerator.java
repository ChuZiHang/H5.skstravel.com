package com.skstravel.common.tools;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;


public class MybatisGenerator {

    public static void main(String[] args) {

        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        String filePath = Thread.currentThread().getContextClassLoader().getResource("generatorConfig.xml").getPath();
        System.out.println(filePath);
        try {
            File configFile = new File(filePath);
            ConfigurationParser cp = new ConfigurationParser(warnings);
            Configuration config = cp.parseConfiguration(configFile);
            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
            myBatisGenerator.generate(null);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}
