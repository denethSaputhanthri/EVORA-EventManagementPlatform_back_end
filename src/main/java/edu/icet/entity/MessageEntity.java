package edu.icet.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "message")
public class MessageEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer messageId;
    private Integer senderId;
    private Integer receiverId;
    private String content;
    private LocalDate sentAt;
}
