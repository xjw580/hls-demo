package club.xiaojiawei.videodemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

@SpringBootApplication
public class VideoDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(VideoDemoApplication.class, args);
    }

}
