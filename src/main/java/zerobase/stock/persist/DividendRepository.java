package zerobase.stock.persist;

import org.springframework.data.jpa.repository.JpaRepository;
import zerobase.stock.persist.entity.DividendEntity;

public interface DividendRepository extends JpaRepository<DividendEntity, Long> {
}
