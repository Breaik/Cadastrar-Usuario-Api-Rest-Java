package ex_api_rest.exercicio.Repository;

import ex_api_rest.exercicio.Model.UserModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserModel, Integer>{
}
