package com.springcore.spEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("spelconfig.xml");
        Demo demo=context.getBean("demo", Demo.class);
        System.out.println(demo);

        SpelExpressionParser temp=new SpelExpressionParser();
        Expression expression= temp.parseExpression("23+232");
        System.out.println(expression.getValue());

    }
}
