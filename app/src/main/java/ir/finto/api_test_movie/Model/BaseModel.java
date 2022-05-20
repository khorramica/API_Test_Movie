package ir.finto.api_test_movie.Model;

import java.util.List;

public class BaseModel {

    private int page;

    private int total_pages;

    private int total_results;

    private List<Result> result;

    public BaseModel(int page, int total_pages, int total_results, List<Result> result) {
        this.page = page;
        this.total_pages = total_pages;
        this.total_results = total_results;
        this.result = result;
    }

    public BaseModel() {
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

    public int getTotal_results() {
        return total_results;
    }

    public void setTotal_results(int total_results) {
        this.total_results = total_results;
    }

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }
}
