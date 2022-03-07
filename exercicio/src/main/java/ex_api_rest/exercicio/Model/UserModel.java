package ex_api_rest.exercicio.Model;


import javax.persistence.*;

@Entity
@Table(name = "Teste")
public class UserModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer codigo;
    @Column (name = "nome", nullable = false, length = 20)
    private String nome;
    @Column (name = "login", nullable = false, length = 20)
    private String login;
    @Column (name = "senha", nullable = false, length = 20)
    private String senha;

    public UserModel() {

    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
