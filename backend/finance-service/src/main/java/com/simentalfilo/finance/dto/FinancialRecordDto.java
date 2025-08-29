package com.simentalfilo.finance.dto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import java.time.LocalDate;
@Data
public class FinancialRecordDto {
  private String id;
  @NotNull private LocalDate date;
  @NotBlank private String type;
  private double amount;
  private String description;
  private String animalId;
}
