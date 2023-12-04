package com.example.demo.reddit.commentsFeature;

import com.example.demo.reddit.postFeature.PostModel;
import com.example.demo.reddit.userFeature.UserModel;
import jakarta.persistence.*;
import java.time.Instant;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CommentModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String text;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "postId", referencedColumnName = "postId")
  private PostModel post;

  private Instant createdDate;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "userId", referencedColumnName = "userId")
  private UserModel user;

  private Boolean hasParent;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "parentId", referencedColumnName = "id")
  private CommentModel parent;
}
