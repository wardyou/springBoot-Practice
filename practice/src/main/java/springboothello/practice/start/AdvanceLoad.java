package springboothello.practice.start;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(3)
public class AdvanceLoad implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("this is one .....");
    }
}
