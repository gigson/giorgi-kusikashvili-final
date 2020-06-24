package giorgi.kusikashvili.demo.repository;

import giorgi.kusikashvili.demo.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
