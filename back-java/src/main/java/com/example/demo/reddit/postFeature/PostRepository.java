package com.example.demo.reddit.postFeature;

import com.example.demo.reddit.subRedditFeature.SubRedditModel;
import com.example.demo.reddit.userFeature.UserModel;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<PostModel, Long> {
  List<PostModel> findAllBySubreddit(SubRedditModel subreddit);

  List<PostModel> findByUser(UserModel user);
}
