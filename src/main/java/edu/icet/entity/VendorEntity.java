package edu.icet.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class VendorEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer vendorId;
    private Integer userId;
    private String companyName;
    private String bio;
    private String phone;
}
