package br.edu.ifnmg.posto.dados;

import br.edu.ifnmg.posto.modelo.Cliente;

import java.util.Map;
import java.util.HashMap;

public class ClienteDAO {
    
    private static Map<String,Cliente> clientes = new HashMap<>();
    
    public static void adicionarCliente(Cliente cliente){
        clientes.put(cliente.getNome(), cliente);
    }    
}