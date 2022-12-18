package com.example.mini_project.search;

public class SearchDTO {
    private String card_name;

    public String getCard_name() {
        return card_name;
    }

    public void setCard_name(String card_name) {
        this.card_name = card_name;
    }

    public SearchDTO(String card_name) {
        this.card_name = card_name;
    }
}
