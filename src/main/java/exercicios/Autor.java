package exercicios;

public class Autor {
    private String nome;
    private String email;

    Autor(){
        this.nome = "Thiago Silva";
        this.email = "tiago@gmail.com";
    }
    String getalteraNome(String novoNome){
        return this.nome = novoNome;
    }
    String getalteraEmail(String novoEmail){
        return this.email = novoEmail;
    }


    public static void main(String[] args){
        Autor autor1 = new Autor();
        System.out.println(autor1.nome);
        System.out.println(autor1.email);

       autor1.getalteraNome("ana");
       System.out.println(autor1.nome);

       autor1.getalteraEmail("anamaria@hotmail.com");
       System.out.println(autor1.email);




        }
    }

