package com.example.footballmanagement.service;


import com.example.footballmanagement.dto.response.ClubResponse;
import com.example.footballmanagement.entity.Club;
import com.example.footballmanagement.repository.ClubRepository;

import org.springframework.stereotype.Service;

@Service
public class ClubServiceImp implements ClubService {
    private final ClubRepository clubRepository;

    public ClubServiceImp(ClubRepository clubRepository){
        this.clubRepository=clubRepository;
    }
    private ClubResponse mapToResponse(Club club) {
        ClubResponse response = new ClubResponse();
        response.setId(club.getId());
        response.setName(club.getName());
        response.setCity(club.getCity());
        response.setStadium(club.getStadium());
        response.setFoundedYear(club.getFoundedYear());
        response.setCoach(club.getCoach());
        return response;

    }

    @Override
    public ClubResponse getByName(String name) {
        Club club=clubRepository.findClubByName(name).orElseThrow(()->new RuntimeException("Club not found!"));
        return mapToResponse(club);
    }
}
