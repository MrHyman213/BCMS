package org.hyman.BCMS.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Card")
public class BankCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String number;
    private String period;
    private Float balance;

    @ManyToOne
    @JoinColumn(name = "id_status", referencedColumnName = "id")
    private CardStatus status;

    @ManyToOne
    @JoinColumn(name = "id_user", referencedColumnName = "id")
    private User user;

}
