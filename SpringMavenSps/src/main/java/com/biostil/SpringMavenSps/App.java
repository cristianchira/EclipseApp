package com.biostil.SpringMavenSps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context =new ClassPathXmlApplicationContext("SpringConfig.xml");
      Restaurant restaurantObj =(Restaurant) context.getBean("restaurantBean");
      restaurantObj.prepareHotDrink();
     
      int counter = 0;
      start: {
         for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
               if (i == 5)
                  break start;
            }
            counter++;
         }
      }
      System.out.println(counter);
   }
}
