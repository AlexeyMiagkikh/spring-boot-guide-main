package sorokin.dev.springbootguide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sorokin.dev.springbootguide.employees.Employee;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class SpringBootGuideApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootGuideApplication.class, args);
    }

}
