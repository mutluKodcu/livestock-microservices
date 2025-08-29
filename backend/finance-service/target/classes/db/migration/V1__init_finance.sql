CREATE TABLE IF NOT EXISTS financial_record (
  id VARCHAR(100) PRIMARY KEY,
  date DATE,
  type VARCHAR(50),
  amount NUMERIC,
  description TEXT,
  animal_id VARCHAR(100)
);
