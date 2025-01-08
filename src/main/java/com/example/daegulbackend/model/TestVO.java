package com.example.daegulbackend.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class TestVO {
    private Long userID;
    private String username;
    private String email;
    private LocalDateTime createAt;
}
