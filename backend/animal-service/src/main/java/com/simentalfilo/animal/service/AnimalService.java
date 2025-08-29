package com.simentalfilo.animal.service;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import java.util.List;
import com.simentalfilo.animal.repo.AnimalRepository;
import com.simentalfilo.animal.entity.Animal;
@Service
@RequiredArgsConstructor
public class AnimalService {
  private final AnimalRepository repo;
  public Animal save(Animal a){ return repo.save(a); }
  public List<Animal> findAll(){ return repo.findAll(); }
  public Animal findById(String id){ return repo.findById(id).orElse(null); }
  public void delete(String id){ repo.deleteById(id); }
}
