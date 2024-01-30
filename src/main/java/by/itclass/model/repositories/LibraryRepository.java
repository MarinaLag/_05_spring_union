package by.itclass.model.repositories;

import by.itclass.model.entities.Library;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface LibraryRepository extends JpaRepository<Library, Integer> {


}
