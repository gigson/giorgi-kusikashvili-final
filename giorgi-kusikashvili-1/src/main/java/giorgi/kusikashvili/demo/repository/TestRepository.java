package giorgi.kusikashvili.demo.repository;

import giorgi.kusikashvili.demo.model.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepository extends JpaRepository<Attachment, Long> {
}
