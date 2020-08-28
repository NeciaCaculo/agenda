/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda.controlo;

import agenda.modelo.Cadastro;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Necia
 */
@Named(value = "cadastroMBean")
@RequestScoped
public class CadastroMBean {

   Cadastro cadastro = new Cadastro();
    
    @PostConstruct
    public void init(){}

    public Cadastro getCadastro() {
        return cadastro;
    }

    public void setCadastro(Cadastro cadastro) {
        this.cadastro = cadastro;
    }
    
    public String guardar() {
        return "resultado";
    }
    
}
