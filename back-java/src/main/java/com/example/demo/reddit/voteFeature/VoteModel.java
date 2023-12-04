package com.example.demo.reddit.voteFeature;

import static jakarta.persistence.FetchType.LAZY;
import static jakarta.persistence.GenerationType.IDENTITY;

import com.example.demo.reddit.postFeature.PostModel;
import com.example.demo.reddit.userFeature.UserModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class VoteModel {

  @Id
  @GeneratedValue(strategy = IDENTITY)
  private Long voteId;

  private VoteType voteType;

  @NotNull
  @ManyToOne(fetch = LAZY)
  @JoinColumn(name = "postId", referencedColumnName = "postId")
  private PostModel post;

  @ManyToOne(fetch = LAZY)
  @JoinColumn(name = "userId", referencedColumnName = "userId")
  private UserModel user;
}
