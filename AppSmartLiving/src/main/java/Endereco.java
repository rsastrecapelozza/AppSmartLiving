
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
public class Endereco
{
    @Id
    @SequenceGenerator(name="endereco", sequenceName="sq_tb_endereco", allocationSize = 1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="endereco")
    @Column(name="ds_end")
    String ds_end;
    @Column(name="uf")
    String uf;
    @Column(name="cep")
    int cep;

}
