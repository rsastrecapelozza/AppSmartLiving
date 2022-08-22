package ______________;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
public class Usuario 
{
    @Id
    @SequenceGenerator(name="usuario", sequenceName="sq_tb_usuario", allocationSize = 1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="usuario")
    @Column(name="nm_usuario")
    public String nm_usuario;
    @Column(name="nr_telefone")
    public int nr_telefone;
    @Column(name="ds_email")
    private String ds_email;
    @Column(name="senha")
    private String senha;


    public Usuario PesquisaKeyword(int id_usuario)
    {
    	
    }
}
