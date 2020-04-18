package com.capg.lab1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(EmployeeConfig.class);
        

          SBU sbu=(SBU) context.getBean("sbu");
          sbu.display();
    }
}
