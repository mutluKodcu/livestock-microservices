package com.simentalfilo.finance.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import java.time.LocalDate;
@Data
@Entity
public class FinancialRecord {
  @Id private String id;
  private LocalDate date;
  private String type;
  private double amount;
  private String description;
  private String animalId;
}
