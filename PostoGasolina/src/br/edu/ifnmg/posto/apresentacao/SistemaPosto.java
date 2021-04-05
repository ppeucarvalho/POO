package br.edu.ifnmg.posto.apresentacao;

import br.edu.ifnmg.posto.controle.ClienteControlador;
import java.util.Scanner;
import br.edu.ifnmg.posto.modelo.Cliente;
import br.edu.ifnmg.posto.modelo.Estacionamento;

public class SistemaPosto {
    public static void main(String[] parametros){
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        do{
            try{
                System.out.println("\n\n-------- Menu ------");
                System.out.println("Operação: ");
                System.out.println("1 - Cadastrar cliente");
                System.out.println("2 - Exibir quantidade de clientes cadastrados");
                System.out.println("3 - Comprar serviço");
                System.out.println("4 - Listar todos clientes");
                System.out.println("0 - Sair");
                System.out.println("Informe a operação: ");

                opcao = Integer.parseInt(scanner.nextLine());
                
                if(opcao == 1){
                    cadastrarCliente(scanner);
                }
                else if(opcao == 2){
                    exibirQuantidade(scanner);
                }
                else if(opcao == 3){
                    comprarServico(scanner);
                }
                /*}else if(opcao == 4){
                    exibirTodosClientes();
                }*/
            }catch(NumberFormatException e){
                System.out.println("\nNúmero digitado inválido! Tente novamente...");
                opcao = -1;
            }catch(Exception e){
                System.out.println("\nERRO! Tente novamente.");
                opcao = -1;                
            }

        }while(opcao != 0);
    }
    private static void cadastrarCliente(Scanner scanner) {
        System.out.println("Cadastro de cliente:");
        
        Cliente cliente = null;                
        
        System.out.println("Nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.println("Endereço: ");
        String endereco = scanner.nextLine();
        
        System.out.println("CPF: ");
        String cpf = scanner.nextLine();
        
        System.out.println("Contato: ");
        String contato = scanner.nextLine();
                
        //Cliente cliente = null;
        cliente = new Cliente(nome,endereco,cpf,contato);
        
        
        ClienteControlador clienteControlador = new ClienteControlador();
        clienteControlador.cadastrarCliente(cliente);
        
        System.out.println("Cadastrado REALIZADO com sucesso!!!!");
    }
    private static void exibirQuantidade(Scanner scanner){
        System.out.printf("Total de clientes: %d",Cliente.getTotalCliente());
    }
    
    private static void comprarServico(Scanner scanner){
        System.out.println("Digite o servico: 1 - Estacionamento | 2 - Combustivel | 3 - Lavagem ");
        int servico = Integer.parseInt(scanner.nextLine());
        if (servico == 1){
           System.out.println("Digite a hora chegada:");
           int chegada = Integer.parseInt(scanner.nextLine());
           
           System.out.println("Digite a hora saída:");
           int saida = Integer.parseInt(scanner.nextLine());
          // Estacionamento novo;
           Estacionamento novo = new Estacionamento(chegada,saida);
           novo.calculoEstacinamento(chegada,saida);
                  
        }
        else if(servico == 2){
            System.out.println("Digite a hora chegada:");
            int chegada = Integer.parseInt(scanner.nextLine());
            exibirQuantidade(scanner);
        }
        else if(servico == 3){
            comprarServico(scanner);
        }
    }        
        
 }

