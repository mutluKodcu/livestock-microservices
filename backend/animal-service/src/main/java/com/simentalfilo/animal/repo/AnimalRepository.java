package com.simentalfilo.animal.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import com.simentalfilo.animal.entity.Animal;
public interface AnimalRepository extends JpaRepository<Animal, String> {}
