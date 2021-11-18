package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {


      Map<String,Object> cache = new HashMap<String,Object>();

public static final string api_url="https://equifix.com/getscores";


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("running");

                 int a=10;
               

	}


   public void loadDataToCache(){
      //logic
}
public void doprocess(){
//logic here


}
