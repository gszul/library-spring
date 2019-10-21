package pl.mezameru.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.mezameru.library.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
