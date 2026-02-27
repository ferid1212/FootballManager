package com.example.footballmanagement.service;

import com.example.footballmanagement.dto.response.ClubResponse;

public interface ClubService  {
    ClubResponse getByName(String name);
}
