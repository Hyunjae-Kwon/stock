package zerobase.stock.scraper;

import zerobase.stock.model.Company;
import zerobase.stock.model.ScrapedResult;

public interface Scraper {
    Company scrapCompanyByTicker(String ticker);
    ScrapedResult scrap(Company company);
}
