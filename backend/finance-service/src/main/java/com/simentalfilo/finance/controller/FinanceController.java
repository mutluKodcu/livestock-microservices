package com.simentalfilo.finance.controller;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;
import java.util.List;
import jakarta.validation.Valid;
import com.simentalfilo.finance.service.FinanceService;
import com.simentalfilo.finance.mapper.FinancialMapper;
import com.simentalfilo.finance.dto.FinancialRecordDto;
import com.simentalfilo.finance.entity.FinancialRecord;

@RestController
@RequestMapping("/api/finance")
@RequiredArgsConstructor
public class FinanceController {
  private final FinanceService service;
  private final FinancialMapper mapper;

  @GetMapping public List<FinancialRecordDto> all(){ return service.findAll().stream().map(mapper::toDto).toList(); }
  @PostMapping public FinancialRecordDto create(@Valid @RequestBody FinancialRecordDto dto){ FinancialRecord e = mapper.toEntity(dto); e = service.save(e); return mapper.toDto(e); }
}
