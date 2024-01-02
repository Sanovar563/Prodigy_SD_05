package com.practice.myapps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.practice.myapps.Service.WebScraperService;

@SpringBootApplication
public class MyappsApplication implements CommandLineRunner {

    private final WebScraperService webScraperService;

    @Autowired
    public MyappsApplication(WebScraperService webScraperService) {
        this.webScraperService = webScraperService;
    }

    public static void main(String[] args) {
        SpringApplication.run(MyappsApplication.class, args);
    }

    @Override
    public void run(String... args) {
        webScraperService.scrapeQuotesWebsite();
    }
	
}
