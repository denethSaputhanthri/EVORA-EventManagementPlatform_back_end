package edu.icet.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "service")
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
