package edu.icet.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "vendor")
public class VendorEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer vendorId;
    private Integer userId;
    private String companyName;
    private String bio;
    private String phone;
}
