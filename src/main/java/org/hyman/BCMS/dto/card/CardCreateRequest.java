package org.hyman.BCMS.dto.card;

import lombok.Data;

@Data
public class CardCreateRequest {


    private String number;
    private String period;
    private Float balance;
    private String status;
    private int userId;

    public CardCreateRequest(String number, String period, String status, int userId) {
        this.number = number;
        this.period = period;
        this.status = status;
        this.userId = userId;
        this.balance = 0.0f;
    }
}
