package org.hyman.BCMS.util.mapping;

import lombok.RequiredArgsConstructor;
import org.hyman.BCMS.dto.User.UserResponse;
import org.hyman.BCMS.dto.card.CardCreateRequest;
import org.hyman.BCMS.dto.card.CardResponse;
import org.hyman.BCMS.entity.BankCard;
import org.hyman.BCMS.entity.Role;
import org.hyman.BCMS.service.CardStatService;
import org.hyman.BCMS.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class CardMapper {

    private final UserService userService;
    private final CardStatService cardStatService;
    private final ModelMapper modelMapper;

    public BankCard dtoToMap(CardCreateRequest dto){
        BankCard card = modelMapper.map(dto, BankCard.class);
        card.setStatus(cardStatService.getStatusByName(dto.getStatus()));
        card.setUser(userService.getById(dto.getUserId()));
        return card;
    }

    public CardResponse mapToDto(BankCard card){
        CardResponse cardResponse = modelMapper.map(card, CardResponse.class);
        UserResponse userResponse = modelMapper.map(card.getUser(), UserResponse.class);
        userResponse.setRoles(card.getUser().getRoleList().stream().map(Role::getName)
                .collect(Collectors.joining(", ")));
        cardResponse.setUserResponse(userResponse);
        cardResponse.setStatus(card.getStatus().getName());
        return cardResponse;
    }
}
