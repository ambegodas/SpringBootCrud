package crud.domain;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface PostRepository extends CrudRepository<Post,Long> {

}
