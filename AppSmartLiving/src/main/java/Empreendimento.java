import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
public class Empreendimento
{
    @Id
    @SequenceGenerator(name="empreendimento", sequenceName="sq_tb_empreendimento", allocationSize = 1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="empreendimento")
    @Column(name="nm_emp")
    String nm_emp;

}

