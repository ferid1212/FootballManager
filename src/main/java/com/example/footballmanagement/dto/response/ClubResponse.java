package com.example.footballmanagement.dto.response;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ClubResponse {
    Long id;
    String name;
    int foundedYear;
    String Stadium;
    String city;
    String coach;
}
