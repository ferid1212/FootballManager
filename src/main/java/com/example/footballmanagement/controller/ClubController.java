package com.example.footballmanagement.controller;

import com.example.footballmanagement.dto.response.ClubResponse;
import com.example.footballmanagement.service.ClubServiceImp;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clubs")
public class ClubController {
    private final ClubServiceImp clubServiceImp;
    public ClubController(ClubServiceImp clubServiceImp){
        this.clubServiceImp = clubServiceImp;

    }
    @GetMapping("/{name}")
    public ClubResponse getClub(@PathVariable String name){
        return clubServiceImp.getByName(name);
    }

}
