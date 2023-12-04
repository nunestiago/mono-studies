package com.example.demo.reddit.verificationFeature;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VerificationTokenRepository
  extends JpaRepository<VerificationTokenModel, Long> {
  Optional<VerificationTokenModel> findByToken(String token);
}
