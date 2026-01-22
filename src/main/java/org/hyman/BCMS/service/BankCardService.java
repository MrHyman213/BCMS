package org.hyman.BCMS.service;

import lombok.RequiredArgsConstructor;
import org.hyman.BCMS.dto.card.CardCreateRequest;
import org.hyman.BCMS.dto.card.CardResponse;
import org.hyman.BCMS.repository.BankCardRepository;
import org.hyman.BCMS.util.mapping.CardMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class BankCardService {

    private final BankCardRepository cardRepository;

    private final CardMapper cardMapper;

    public List<CardResponse> getAll(){
        return cardRepository.findAll().stream().map(cardMapper::mapToDto).collect(Collectors.toList());
    }

    public void createBankCard(CardCreateRequest dto){
        cardRepository.save(cardMapper.dtoToMap(dto));
    }

}
