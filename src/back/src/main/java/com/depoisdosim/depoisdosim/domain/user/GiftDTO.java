package com.depoisdosim.depoisdosim.domain.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GiftDTO {
    private Long id;
    private String name;
    private String description;
    private Boolean available;
    private Double price;
    private String image;
    private Long weddingId;
}
