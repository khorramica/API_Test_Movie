package ir.finto.api_test_movie.Model;

public class News {
    private String title;
    private String author;
    private String published_date;
    private String link;
    private String summary;
    private String rank;
    private String country;
    private String media;
    private String _score;

    public News(String title, String author, String published_date, String link, String summary, String rank, String country, String media, String _score) {
        this.title = title;
        this.author = author;
        this.published_date = published_date;
        this.link = link;
        this.summary = summary;
        this.rank = rank;
        this.country = country;
        this.media = media;
        this._score = _score;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublished_date() {
        return published_date;
    }

    public void setPublished_date(String published_date) {
        this.published_date = published_date;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public String get_score() {
        return _score;
    }

    public void set_score(String _score) {
        this._score = _score;
    }
}
