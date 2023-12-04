package com.example.demo.reddit.userFeature;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.Instant;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class UserModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long userId;

  private String username;
  private String password;
  private String email;
  private Instant created;
  private boolean enabled;
}
