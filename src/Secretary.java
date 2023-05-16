public class Secretary extends User implements Login{

    private Authentic autenticador;

    public Secretary() { this.autenticador = new Authentic();
    }

    @Override
    public void setSenha(int senha){
        this.autenticador.setSenha(senha) ;

    }

    @Override
    public boolean autentica(int senha){
       return this.autenticador.autentica(senha);
       }

        }



