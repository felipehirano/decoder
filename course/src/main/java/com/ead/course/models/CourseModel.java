package com.ead.course.models;

import java.time.LocalDateTime;
import java.util.UUID;

import com.ead.course.enums.CourseLevel;
import com.ead.course.enums.CourseStatus;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;

import jakarta.persistence.*;

@Entity
@Table(name="tb_courses")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CourseModel {
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID courseId;

  @Column(unique = true, nullable = false, length = 150)
  private String name;

  @Column(nullable = false, length = 255)
  private String description;

  @Column(nullable = false)
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
  private LocalDateTime creationDate;

  @Column(nullable = false)
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
  private LocalDateTime lastUpdateDate;

  @Column(nullable = false)
  @Enumerated(EnumType.STRING)
  private CourseStatus courseStatus;

  @Column(nullable = false)
  @Enumerated(EnumType.STRING)
  private CourseLevel courseLevel;

  @Column(nullable = false)
  private UUID userInstructor;

  @Column(length = 255)
  private String imageUrl;

  public UUID getCourseId() {
    return courseId;
  }

  public void setCourseId(UUID courseId) {
    this.courseId = courseId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LocalDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(LocalDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public LocalDateTime getLastUpdateDate() {
    return lastUpdateDate;
  }

  public void setLastUpdateDate(LocalDateTime lastUpdateDate) {
    this.lastUpdateDate = lastUpdateDate;
  }

  public CourseStatus getCourseStatus() {
    return courseStatus;
  }

  public void setCourseStatus(CourseStatus courseStatus) {
    this.courseStatus = courseStatus;
  }

  public CourseLevel getCourseLevel() {
    return courseLevel;
  }

  public void setCourseLevel(CourseLevel courseLevel) {
    this.courseLevel = courseLevel;
  }

  public UUID getUserInstructor() {
    return userInstructor;
  }

  public void setUserInstructor(UUID userInstructor) {
    this.userInstructor = userInstructor;
  }

  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }
}
