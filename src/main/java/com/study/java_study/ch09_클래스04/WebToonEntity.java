package com.study.java_study.ch09_클래스04;

public class WebToonEntity {

    private int WebToonId;
    private String WebToonName;
    private String author;
    private String site;

    public WebToonEntity() {
    }

    public WebToonEntity(int webToonId, String webToonName, String author, String site) {
        WebToonId = webToonId;
        WebToonName = webToonName;
        this.author = author;
        this.site = site;
    }

    public int getWebToonId() {
        return WebToonId;
    }

    public void setWebToonId(int webToonId) {
        WebToonId = webToonId;
    }

    public String getWebToonName() {
        return WebToonName;
    }

    public void setWebToonName(String webToonName) {
        WebToonName = webToonName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    @Override
    public String toString() {
        return "WebToonEntity{" +
                "WebToonId=" + WebToonId +
                ", WebToonName='" + WebToonName + '\'' +
                ", author='" + author + '\'' +
                ", site='" + site + '\'' +
                '}';
    }
}
