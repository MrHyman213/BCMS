package org.hyman.BCMS.controller.admin;

import lombok.RequiredArgsConstructor;
import org.hyman.BCMS.dto.card.CardCreateRequest;
import org.hyman.BCMS.dto.card.CardResponse;
import org.hyman.BCMS.service.AdminService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/admin/cards")
public class AdminCardController {

    private final AdminService adminService;

    // create
    @PostMapping("/create")
    public HttpStatus createCard(@RequestBody CardCreateRequest cardDTO){
        adminService.createCard(cardDTO);
        return HttpStatus.OK;
    }
    // block

    // activate

    // delete

    // getAllCard
    @GetMapping
    public List<CardResponse> getAllCards(){
        return adminService.getAllCards();
    }
}
