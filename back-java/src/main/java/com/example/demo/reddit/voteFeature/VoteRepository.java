package com.example.demo.reddit.voteFeature;

import com.example.demo.reddit.postFeature.PostModel;
import com.example.demo.reddit.userFeature.UserModel;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoteRepository extends JpaRepository<VoteModel, Long> {
  Optional<VoteModel> findTopByPostAndUserOrderByVoteIdDesc(
    PostModel post,
    UserModel currentUser
  );
}
