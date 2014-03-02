/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.food.Config;

import com.mycompany.food.dip.dipCorrection.Fruit;
import com.mycompany.food.dip.dipCorrection.Apple;
import com.mycompany.food.dip.dipCorrection.AppleInt;
import org.springframework.context.annotation.Bean;


/**
 *
 * @author Sibakhulu
 */
public class AppConfig {
 @Bean(name="Dip")
public AppleInt getService(){
return new Apple();
}
@Bean(name="dip")
public AppleInt getServicenew(){
return (AppleInt) new Fruit();
}

}
