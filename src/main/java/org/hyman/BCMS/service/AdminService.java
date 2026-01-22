package org.hyman.BCMS.service;

import lombok.RequiredArgsConstructor;
import org.hyman.BCMS.dto.card.CardCreateRequest;
import org.hyman.BCMS.dto.card.CardResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminService {

    private final BankCardService bankCardService;


    public List<CardResponse> getAllCards(){
        return bankCardService.getAll();
    }

    public void createCard(CardCreateRequest cardDTO){
        bankCardService.createBankCard(cardDTO);
    }

}
