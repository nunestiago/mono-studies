package com.example.demo.reddit.postFeature;

import com.example.demo.reddit.subRedditFeature.SubRedditModel;
import com.example.demo.reddit.userFeature.UserModel;
import jakarta.persistence.*;
import java.time.Instant;
import lombok.*;

@Getter
@Setter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PostModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long postId;

  private String postName;
  private String url;

  @Lob
  private String description;

  private Integer voteCount = 0;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "userId", referencedColumnName = "userId")
  private UserModel user;

  private Instant createdDate;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id", referencedColumnName = "id")
  private SubRedditModel subreddit;
}
