package Tests;

import Entidades.Usuario;
import Entidades.Pessoa;
import Entidades.Pessoal.Contato;
import Entidades.Pessoal.Documento;
import Entidades.Pessoal.Endereco;

public class _Usuario {
        public static void main(String[] args) throws Exception {

                String idUsuario = lib.Geradores.Strings.gerar(10);
                String idPessoa = lib.Geradores.Strings.gerar(10);
                String idDocumento = lib.Geradores.Strings.gerar(10);
                String idContato = lib.Geradores.Strings.gerar(10);
                String idEndereco = lib.Geradores.Strings.gerar(10);

                Contato contato = new Contato(
                                idContato,
                                idPessoa,
                                "luka.pc.pc@gmail.com",
                                "(45) 98820-0894",
                                "(45) 3054-1647");

                Endereco endereco = new Endereco(
                                idEndereco,
                                idPessoa,
                                "Rua Beija Flor",
                                "393",
                                "85902-140",
                                "PARANA",
                                "TOLEDO");

                Documento documento = new Documento(
                                idPessoa,
                                idDocumento,
                                "cpf",
                                "101.247.089-00");

                Pessoa pessoa = new Pessoa(
                                idPessoa,
                                "Lucas",
                                "Neitzke",
                                "08/07/1996",
                                documento,
                                contato,
                                endereco);

                Usuario usuario = new Usuario(
                                idUsuario,
                                "lukas13on",
                                "30541647",
                                pessoa);

                System.out.println(usuario.toString());

                String nome = usuario.getPessoa().getNome();
                String acesso = usuario.getAcesso();
                String senha = usuario.getSenha();
                System.out.println("Acesso :" + acesso);
                System.out.println("senha :" + senha);
                System.out.println("Olá :" + nome);

        }
}
