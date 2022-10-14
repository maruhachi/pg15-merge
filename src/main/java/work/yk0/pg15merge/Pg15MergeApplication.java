package work.yk0.pg15merge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.MappedSuperclass;

@SpringBootApplication
public class Pg15MergeApplication implements CommandLineRunner {

    @Autowired
    AppService appService;

    public static void main(String[] args) {
        SpringApplication.run(Pg15MergeApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        if (args[0].equals("traditional")) {
            appService.execTraditional();
        } else {
            appService.execNewfeature();
        }
    }
}
