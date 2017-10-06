package com.hyojinbae.sample.java9.spring.boot;

import com.hyojinbae.sample.java9.spring.boot.api.GreetingService;
import java.util.ServiceLoader;

public class Java9SpringBootApplication {

	public static void main(String[] args) {
		ServiceLoader
				.load(GreetingService.class)
				.stream()
                .map(ServiceLoader.Provider::get)
				.map(GreetingService::greet)
                .forEach(System.out::println)
                ;

        System.out.println("The end of Application");
    }

}
