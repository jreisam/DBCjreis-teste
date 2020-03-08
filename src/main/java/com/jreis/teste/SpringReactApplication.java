package com.jreis.teste;

import com.jreis.teste.domain.Sequence;
import com.jreis.teste.repository.SequenceRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class SpringReactApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringReactApplication.class, args);
    }


    @Component
    public class DatabaseLoader implements CommandLineRunner {
        // Sequence
        private final SequenceRepository sequenceRepository;

        public DatabaseLoader(SequenceRepository repository) {
            this.sequenceRepository = repository;
        }

        @Override
        public void run(String... strings) throws Exception {
            this.sequenceRepository.save(new Sequence(1, 'N'));
        }
    }
}
