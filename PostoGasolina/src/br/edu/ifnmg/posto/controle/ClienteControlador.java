package br.edu.ifnmg.posto.controle;

import br.edu.ifnmg.posto.dados.ClienteDAO;
import br.edu.ifnmg.posto.modelo.Cliente;
import java.util.List;

public class ClienteControlador{
    
    public void cadastrarCliente(Cliente cliente){
        ClienteDAO.adicionarCliente(cliente);
    }
    
}