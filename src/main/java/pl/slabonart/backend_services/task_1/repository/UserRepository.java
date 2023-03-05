package pl.slabonart.backend_services.task_1.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.slabonart.backend_services.task_1.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
