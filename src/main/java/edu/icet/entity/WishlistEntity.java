package edu.icet.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table (name = "wishlist")
public class WishlistEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer wishlistId;
    private Integer userId;
    private Integer serviceId;
    private LocalDateTime addedAt;
}
