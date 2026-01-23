package org.hyman.BCMS.controller.admin;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.hyman.BCMS.dto.card.CardCreateRequest;
import org.hyman.BCMS.dto.card.CardResponse;
import org.hyman.BCMS.service.AdminService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Tag(name = "Administrator controller for manipulating bank cards")
@RestController
@RequiredArgsConstructor
@RequestMapping("/admin/cards")
public class AdminCardController {

    private final AdminService adminService;

    // create
    @Operation(description = "Creating new bank card")
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
    @Operation(description = "Getting all cards on system with owner information")
    public List<CardResponse> getAllCards(){
        return adminService.getAllCards();
    }
}
