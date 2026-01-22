package org.hyman.BCMS.dto.card;

import lombok.Data;
import org.hyman.BCMS.dto.User.UserResponse;

@Data
public class CardResponse {

    private int id;
    private String number;
    private String period;
    private Float balance;
    private String status;
    private UserResponse userResponse;
}
