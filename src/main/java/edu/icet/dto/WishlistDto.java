package edu.icet.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class WishlistDto {
    private Integer wishlistId;
    private Integer userId;
    private Integer serviceId;
    private LocalDateTime addedAt;
}
