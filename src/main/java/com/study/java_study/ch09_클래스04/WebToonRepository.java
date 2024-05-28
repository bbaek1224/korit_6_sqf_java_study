package com.study.java_study.ch09_클래스04;

public class WebToonRepository {

    private int webToonId;
    private WebToonEntity[] webToons;

    public WebToonRepository() {
        webToons = new WebToonEntity[0];
    }

    private void extendWebToons() {
        WebToonEntity[] newWebToon = new WebToonEntity[webToons.length + 1];
        for(int i = 0; i < webToons.length; i++) {
            newWebToon[i] = webToons[i];
        }
        webToons = newWebToon;
    }

    public void saveWebToon(WebToonEntity webToon) {
        extendWebToons();
        webToons[getLastIndex()] = webToon;
    }

    private int getLastIndex() {
        return webToons.length - 1;
    }

    public WebToonEntity findWebToonByWebToonId(int webToonId) {
        WebToonEntity findWebToon = null;
        for(WebToonEntity webToon : webToons) {
            if(webToon.getWebToonId() == webToonId){
                findWebToon = webToon;
                break;
            }
        }
        return findWebToon;
    }

    public WebToonEntity findWebToonByWebToonName(String webToonName) {
        WebToonEntity findWebToon = null;
        for(WebToonEntity webToon : webToons) {
            if(webToon.getWebToonName().equals(webToonName)) {
                findWebToon = webToon;
                break;
            }
        }
        return findWebToon;
    }

    private int getNewArraySize(int option, String searchText) {
        int newArraySize = 0;

        switch (option) {
            case 1:
                for(WebToonEntity webToon : webToons) {
                    if(webToon.getWebToonName().contains(searchText)
                            || webToon.getAuthor().contains(searchText)
                            || webToon.getSite().contains(searchText)) {
                        newArraySize++;
                    }
                }
                break;
            case 2:
                for(WebToonEntity webToon : webToons) {
                    if(webToon.getWebToonName().contains(searchText)) {
                        newArraySize++;
                    }
                }
                break;
            case 3:
                for(WebToonEntity webToon : webToons) {
                    if(webToon.getAuthor().contains(searchText)) {
                        newArraySize++;
                    }
                }
                break;
            case 4:
                for(WebToonEntity webToon : webToons) {
                    if(webToon.getSite().contains(searchText)) {
                        newArraySize++;
                    }
                }
        }
        return newArraySize;
    }

    public WebToonEntity[] searchWebToons(int option, String searchText) {
        int newArraySize = getNewArraySize(option, searchText);
        WebToonEntity[] searchWebToons = new WebToonEntity[newArraySize];

        int i = 0;
        switch (option) {
            case 1:
                for(WebToonEntity webToon : webToons) {
                    if(webToon.getWebToonName().contains(searchText)
                            || webToon.getAuthor().contains(searchText)
                            || webToon.getSite().contains(searchText)) {
                        searchWebToons[i] = webToon;
                        i++;
                    }
                }
                break;
            case 2:
                for(WebToonEntity webToon : webToons) {
                    if(webToon.getWebToonName().contains(searchText)) {
                        searchWebToons[i] = webToon;
                        i++;
                    }
                }
                break;
            case 3:
                for(WebToonEntity webToon : webToons) {
                    if(webToon.getAuthor().contains(searchText)) {
                        searchWebToons[i] = webToon;
                        i++;
                    }
                }
                break;
            case 4:
                for(WebToonEntity webToon : webToons) {
                    if(webToon.getSite().contains(searchText)) {
                        searchWebToons[i] = webToon;
                        i++;
                    }
                }
        }
        return searchWebToons;
    }
}
