package com.example.demo.reddit.commentsFeature;

import com.example.demo.reddit.postFeature.PostModel;
import com.example.demo.reddit.userFeature.UserModel;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<CommentModel, Long> {
  List<CommentModel> findByPost(PostModel post);

  List<CommentModel> findAllByUser(UserModel user);
}
