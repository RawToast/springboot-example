package com.githib.rawtoast

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SpringbootTemplateApplication {

    static void main(String[] args) {

        def applicationContext = SpringApplication.run(SpringbootTemplateApplication, args)
        println("Let's run something!")

        String[] beanNames = applicationContext.beanDefinitionNames

        Arrays.sort(beanNames);
        beanNames.each { String beanName ->
            println beanName;
        }
    }
}
