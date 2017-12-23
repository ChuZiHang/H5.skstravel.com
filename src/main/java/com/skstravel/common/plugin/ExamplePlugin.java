package com.skstravel.common.plugin;

import java.util.List;

import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.*;

/**
 * Example类的扩展插件
 *
 * Created by cunxing on 2017/6/29.
 */
public class ExamplePlugin extends PluginAdapter {

    /**
     *
     */
    public ExamplePlugin() {
        super();
    }

    public boolean validate(List<String> warnings) {
        return true;
    }

    @Override
    public boolean modelExampleClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {

        InnerClass criteria = null;
        // first, find the Criteria inner class
        for(InnerClass innerClass: topLevelClass.getInnerClasses()) {
            if("GeneratedCriteria".equals(innerClass.getType().getShortName())) { //$NON-NLS-1$
                criteria = innerClass;
                break;
            }
        }

        if(criteria == null) {
            // can't find the inner class for some reason, bail out.
            return true;
        }

        Method method = new Method();
        method.setVisibility(JavaVisibility.PUBLIC);
        method.addParameter(new Parameter(FullyQualifiedJavaType.getStringInstance(), "value")); //$NON-NLS-1$

        method.setName("customClauseSql");
        method.setReturnType(FullyQualifiedJavaType.getCriteriaInstance());

        StringBuilder sb = new StringBuilder();
        sb.append("addCriterion(\"(\" + value+ \")\");"); //$NON-NLS-1$
        method.addBodyLine(sb.toString());
        method.addBodyLine("return (Criteria) this;"); //$NON-NLS-1$

        criteria.addMethod(method);

        return true;
    }
}
