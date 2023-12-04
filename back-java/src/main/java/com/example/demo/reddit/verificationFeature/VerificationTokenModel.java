package com.example.demo.reddit.verificationFeature;

import static jakarta.persistence.FetchType.LAZY;
import static jakarta.persistence.GenerationType.IDENTITY;

import com.example.demo.reddit.userFeature.UserModel;
import jakarta.persistence.*;
import java.time.Instant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "token")
public class VerificationTokenModel {

  @Id
  @GeneratedValue(strategy = IDENTITY)
  private Long id;

  private String token;

  @OneToOne(fetch = LAZY)
  private UserModel user;

  private Instant expiryDate;
}
