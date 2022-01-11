package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author chen
 */
@Data
@AllArgsConstructor
@Configuration(proxyBeanMethods = false)
public class User {


    public static final String name = "tony";

    public String toString(){
        return null;
    }

    public static void main(String[] args) {
        int n = User.fn(1);
        System.out.println(n);

        System.out.println(n);
        System.out.println(n);
        System.out.println(n);
        System.out.println(n);

    }



    public static int fn(int i){
        return i+1;
    }

}
