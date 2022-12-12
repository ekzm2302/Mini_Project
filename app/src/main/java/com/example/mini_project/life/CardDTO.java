package com.example.mini_project.life;

public class CardDTO {
    private String card_name;

    public String getCard_name() {
        return card_name;
    }

    public void setCard_name(String card_name) {
        this.card_name = card_name;
    }

    public CardDTO(String card_name) {
        this.card_name = card_name;
    }
}
