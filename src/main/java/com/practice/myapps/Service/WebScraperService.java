package com.practice.myapps.Service;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class WebScraperService {

    public void scrapeQuotesWebsite() {
        try {
            // Replace the URL with the website you want to scrape
            String url = "http://quotes.toscrape.com";
            Document document = Jsoup.connect(url).get();

            // Example: Extracting quotes from the website
            Elements quoteElements = document.select(".text");

            for (Element quoteElement : quoteElements) {
                System.out.println(quoteElement.text());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
