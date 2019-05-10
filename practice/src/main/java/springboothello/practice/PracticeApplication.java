package springboothello.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * spring 启动类
 */
@SpringBootApplication
public class PracticeApplication {

    public static void main(String[] args) {
        System.out.println("application is start");
        SpringApplication.run(PracticeApplication.class, args);
        System.out.println("application has started");
    }

}
