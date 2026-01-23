package org.hyman.BCMS.dto.card;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "the form for creating a bank card (simple version)")
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
