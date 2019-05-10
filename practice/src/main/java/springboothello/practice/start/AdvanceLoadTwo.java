package springboothello.practice.start;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 如果不加oder注解排在有注解之后
 */
@Component
@Order(1)
public class AdvanceLoadTwo implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("this is two ...");
    }
}
