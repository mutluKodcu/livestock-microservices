package com.simentalfilo.animal.dto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import java.time.LocalDate;
@Data
public class AnimalDto {
  private String id;
  @NotBlank private String earTag;
  @NotBlank private String breed;
  @NotBlank private String gender;
  @NotNull private LocalDate birthDate;
  @NotBlank private String farmId;
}
