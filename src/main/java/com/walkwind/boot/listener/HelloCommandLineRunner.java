package com.walkwind.boot.listener;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @Author walkwind
 * @Description
 * @Date 2020-4-20-17:45
 **/
@Component
public class HelloCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("HelloCommandLineRunner...run..." + args.toString());
    }
}
