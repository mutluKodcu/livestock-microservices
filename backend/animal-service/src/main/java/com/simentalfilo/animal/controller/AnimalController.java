package com.simentalfilo.animal.controller;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;
import java.util.List;
import jakarta.validation.Valid;
import com.simentalfilo.dmtbkts.animal.service.AnimalService;
import com.simentalfilo.dmtbkts.animal.mapper.AnimalMapper;
import com.simentalfilo.dmtbkts.animal.dto.AnimalDto;
import com.simentalfilo.dmtbkts.animal.entity.Animal;

@RestController
@RequestMapping("/api/animals")
@RequiredArgsConstructor
public class AnimalController {
  private final AnimalService service;
  private final AnimalMapper mapper;

  @GetMapping public List<AnimalDto> getAll(){ return service.findAll().stream().map(mapper::toDto).toList(); }
  @GetMapping("/{id}") public AnimalDto getById(@PathVariable String id){ return mapper.toDto(service.findById(id)); }
  @PostMapping public AnimalDto create(@Valid @RequestBody AnimalDto dto){ Animal e = mapper.toEntity(dto); e = service.save(e); return mapper.toDto(e); }
  @PutMapping("/{id}") public AnimalDto update(@PathVariable String id,@Valid @RequestBody AnimalDto dto){ dto.setId(id); Animal e = mapper.toEntity(dto); e = service.save(e); return mapper.toDto(e); }
  @DeleteMapping("/{id}") public void delete(@PathVariable String id){ service.delete(id); }
}
