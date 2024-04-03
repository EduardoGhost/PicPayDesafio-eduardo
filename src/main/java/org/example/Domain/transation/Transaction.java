package org.example.Domain.transation;

import jakarta.persistence.*;
import lombok.*;
import org.example.Domain.user.User;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity(name = "Transations")
@Table(name = "Transations")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode(of="id")
@NoArgsConstructor
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private BigDecimal amount;

    @ManyToOne
    @JoinColumn(name = "sender_id")
    private User sender;
    @ManyToOne
    @JoinColumn(name = "receiver_id")
    private User receiver;

    private LocalDateTime timeStamp;



}
