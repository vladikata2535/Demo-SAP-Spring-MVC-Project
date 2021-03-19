package demosap.demosap.repositories;

import demosap.demosap.models.entities.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdministratorRepo extends JpaRepository<Administrator,Long> {

    Optional<Administrator> findByEmail(String email);

    Optional<Administrator> findByName(String name);
}
