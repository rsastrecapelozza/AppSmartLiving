
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
public class Categoria
{
    @Id
    @SequenceGenerator(name="categoria", sequenceName="sq_tb_categoria", allocationSize = 1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="categoria")
    @Column(name="ds_categoria")
    String ds_categoria;

}
