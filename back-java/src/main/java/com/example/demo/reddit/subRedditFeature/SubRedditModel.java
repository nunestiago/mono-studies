package com.example.demo.reddit.subRedditFeature;

import static jakarta.persistence.FetchType.LAZY;
import static jakarta.persistence.GenerationType.IDENTITY;

import com.example.demo.reddit.postFeature.PostModel;
import com.example.demo.reddit.userFeature.UserModel;
import jakarta.persistence.*;
import java.time.Instant;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class SubRedditModel {

  @Id
  @GeneratedValue(strategy = IDENTITY)
  private Long id;

  private String name;
  private String description;

  @OneToMany(fetch = LAZY)
  private List<PostModel> posts;

  private Instant createdDate;

  @ManyToOne(fetch = LAZY)
  private UserModel user;
}
