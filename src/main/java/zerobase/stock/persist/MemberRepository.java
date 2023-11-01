package zerobase.stock.persist;

import org.springframework.data.jpa.repository.JpaRepository;
import zerobase.stock.persist.entity.MemberEntity;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<MemberEntity, Long> {

    Optional<MemberEntity> findByUsername(String username);

    boolean existsByUsername(String username);

}
