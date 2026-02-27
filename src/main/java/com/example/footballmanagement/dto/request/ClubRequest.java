package com.example.footballmanagement.dto.request;

import jakarta.persistence.GeneratedValue;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ClubRequest {
    @NotBlank
    String name;
}
