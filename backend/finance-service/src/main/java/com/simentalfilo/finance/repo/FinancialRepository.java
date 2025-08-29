package com.simentalfilo.finance.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.simentalfilo.dmtbkts.finance.entity.FinancialRecord;
public interface FinancialRepository extends JpaRepository<FinancialRecord, String> {}
