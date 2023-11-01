package zerobase.stock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;
import zerobase.stock.model.Company;
import zerobase.stock.scraper.YahooFinanceScraper;

import java.io.IOException;

@SpringBootApplication
@EnableScheduling
@EnableCaching
public class StockApplication {

    public static void main(String[] args) {
        SpringApplication.run(StockApplication.class, args);

//        System.out.println("Main -> " + Thread.currentThread().getName());


    }

}
