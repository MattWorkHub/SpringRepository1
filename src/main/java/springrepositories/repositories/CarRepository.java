package springrepositories.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import springrepositories.entities.Car;

public interface CarRepository extends JpaRepository<Car, Long> {



}