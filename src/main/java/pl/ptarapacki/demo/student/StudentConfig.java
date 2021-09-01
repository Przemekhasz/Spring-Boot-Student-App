package pl.ptarapacki.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.FEBRUARY;
import static java.time.Month.SEPTEMBER;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student przemek = new Student(
                    "Przemek",
                    "tarapackiprzemek45@gmai.com",
                    LocalDate.of(2004, FEBRUARY, 22)
            );

            Student madzia = new Student(
                    "Madzia",
                    "Madzia2@gmai.com",
                    LocalDate.of(2002, SEPTEMBER, 19)
            );

            repository.saveAll(
                    List.of(przemek, madzia)
            );
        };
    }
}
