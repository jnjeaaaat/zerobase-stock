package zerobase.stock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zerobase.stock.model.Company;
import zerobase.stock.scraper.YahooFinanceScraper;

import java.io.IOException;

@SpringBootApplication
public class StockApplication {

    public static void main(String[] args) {
//        SpringApplication.run(StockApplication.class, args);

        YahooFinanceScraper yahooFinanceScraper = new YahooFinanceScraper();
//        var result = yahooFinanceScraper.scrap(Company.builder().ticker("O").build());
        var result = yahooFinanceScraper.scrapCompanyByTicker("MMM");
        System.out.println(result);
    }

}
