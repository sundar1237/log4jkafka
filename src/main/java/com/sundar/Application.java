package com.sundar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Application {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    public static void main(String[] args) {
        Application application = new Application();
        application.logger.info("hi");
        ApplicationContext ctx = SpringApplication.run(Application.class, args);

            try{
                for (int i = 0; i <10 ; i++) {
                    Thread.sleep(10000);
                    application.logger.info("sundar message generated " + i);
                }
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                System.exit(0);
            }
    }

}
