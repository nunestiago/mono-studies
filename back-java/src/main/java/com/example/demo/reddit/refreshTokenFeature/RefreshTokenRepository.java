package com.example.demo.reddit.refreshTokenFeature;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RefreshTokenRepository
  extends JpaRepository<RefreshTokenModel, Long> {
  Optional<RefreshTokenModel> findByToken(String token);

  void deleteByToken(String token);
}
