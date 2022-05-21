package ir.finto.api_test_movie.Model;

import java.util.List;

public class BaseFakeNews {
    private String status;
    private int totalResults;
    private List<FakeNews> articles;

    public BaseFakeNews(String status, int totalResults, List<FakeNews> articles) {
        this.status = status;
        this.totalResults = totalResults;
        this.articles = articles;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public List<FakeNews> getArticles() {
        return articles;
    }

    public void setArticles(List<FakeNews> articles) {
        this.articles = articles;
    }
}
