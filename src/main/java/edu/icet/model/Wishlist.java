package edu.icet.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Wishlist {
    private Integer wishlistId;
    private Integer userId;
    private Integer serviceId;
    private LocalDateTime addedAt;
}
