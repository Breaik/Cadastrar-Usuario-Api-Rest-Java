package ex_api_rest.exercicio.Controller;

import ex_api_rest.exercicio.Model.UserModel;
import ex_api_rest.exercicio.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StartController {

    @Autowired
    private UserRepository repository;

    @GetMapping("/start{codigo}")
    public ResponseEntity<UserModel> start(@PathVariable("codigo") Integer codigo){
        UserModel usuario = new UserModel();
        usuario.setCodigo(1);
        usuario.setNome("Guilherme");
        usuario.setLogin("guizin");
        usuario.setSenha("123456");
        return repository.findById(codigo)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }
    @PostMapping("salvar")
    public UserModel salvar(@RequestBody UserModel usuario){
        return repository.save(usuario);
    }
}
