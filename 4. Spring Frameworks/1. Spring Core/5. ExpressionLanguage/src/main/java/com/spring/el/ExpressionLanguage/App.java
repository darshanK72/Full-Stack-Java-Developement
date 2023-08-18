package com.spring.el.ExpressionLanguage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import com.spring.el.ExpressionLanguage.beans.Example;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	
    	Example example = context.getBean("example",Example.class);
    	System.out.println(example);
    	
    	ExpressionParser parser = new SpelExpressionParser();
    	
    	Expression exp = parser.parseExpression("23 + 523");
    	
    	Expression exp1 = parser.parseExpression("(new String('hello world')).toUpperCase()");
    	
    	int x = (Integer) exp.getValue();
    	String out = (String) exp1.getValue();
    	
    	System.out.println(x);
    	System.out.println(out);
    	
    }
}
