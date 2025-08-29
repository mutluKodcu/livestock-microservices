package com.simentalfilo.animal.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import java.time.LocalDate;
@Data
@Entity
public class Animal {
  @Id private String id;
  private String earTag;
  private String breed;
  private String gender;
  private LocalDate birthDate;
  private String farmId;
}
