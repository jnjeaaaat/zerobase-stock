package zerobase.stock.persist;

import org.springframework.data.jpa.repository.JpaRepository;
import zerobase.stock.persist.entity.CompanyEntity;

public interface CompanyRepository extends JpaRepository<CompanyEntity, Long> {
}
