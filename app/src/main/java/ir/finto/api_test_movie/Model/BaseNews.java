package ir.finto.api_test_movie.Model;

import java.util.List;

public class BaseNews {

    private String status;
    private int total_hits;
    private int page;
    private int total_pages;
    private int page_size;
    private List<News> articles;

    public BaseNews(String status, int total_hits, int page, int total_pages, int page_size, List<News> articles) {
        this.status = status;
        this.total_hits = total_hits;
        this.page = page;
        this.total_pages = total_pages;
        this.page_size = page_size;
        this.articles = articles;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotal_hits() {
        return total_hits;
    }

    public void setTotal_hits(int total_hits) {
        this.total_hits = total_hits;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }

    public int getPage_size() {
        return page_size;
    }

    public void setPage_size(int page_size) {
        this.page_size = page_size;
    }

    public List<News> getArticles() {
        return articles;
    }

    public void setArticles(List<News> articles) {
        this.articles = articles;
    }
}
