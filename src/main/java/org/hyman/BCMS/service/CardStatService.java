package org.hyman.BCMS.service;

import lombok.RequiredArgsConstructor;
import org.hyman.BCMS.entity.CardStatus;
import org.hyman.BCMS.repository.CardStatusRepository;
import org.hyman.BCMS.util.exception.ObjectNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CardStatService {

    private final CardStatusRepository statusRepository;

    public CardStatus getStatusByName(String name){
        return statusRepository.findByName(name).orElseThrow(() ->
                new ObjectNotFoundException(String.format("Статус %s не найден", name)));
    }
}
