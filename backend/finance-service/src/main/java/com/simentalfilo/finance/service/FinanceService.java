package com.simentalfilo.finance.service;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import java.util.List;
import com.simentalfilo.dmtbkts.finance.repo.FinancialRepository;
import com.simentalfilo.dmtbkts.finance.entity.FinancialRecord;
@Service
@RequiredArgsConstructor
public class FinanceService {
  private final FinancialRepository repo;
  public FinancialRecord save(FinancialRecord f){ return repo.save(f); }
  public List<FinancialRecord> findAll(){ return repo.findAll(); }
}
