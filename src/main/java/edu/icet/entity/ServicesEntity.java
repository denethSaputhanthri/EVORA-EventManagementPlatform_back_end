package edu.icet.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class ServicesEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer serviceId;
    private Integer vendorId;
    private Integer categoryId;
    private String serviceName;
    private Double basePrice;
    private String description;

}
