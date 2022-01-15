package kg.easy.computerservice.repository;

import kg.easy.computerservice.models.entity.Pc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PcRepository extends JpaRepository<Pc,Integer> {

    List<Pc> findAllByPriceIsLessThan(double price);

}
