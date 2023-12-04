package com.example.demo.reddit.subRedditFeature;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubredditRepository
  extends JpaRepository<SubRedditModel, Long> {
  Optional<SubRedditModel> findByName(String subredditName);
}
