package autom;

public class Sintatico {

    int i = 0;

    public Tokens obter_Token() {
        Funcoes obj2 = new Funcoes();
        return obj2.getTokens().get(i);
    }

    public void Sintatico() {
        Tokens obj = new Tokens();
        obj = obter_Token();
        i++;
        if (obj.getConteudo().equals("programa")) {
            System.out.println("BREAK! 'programa' não encontrado");
            return;
        }
        obj = obter_Token();
        i++;
        if (obj.getTipo().equals("Identificador")) {
            System.out.println("BREAK! Identificador não encontrado");
            return;
        }
        obj = obter_Token();
        i++;
        if (obj.getConteudo().equals(";")) {
            System.out.println("BREAK! ';' não encontrado");
            return;
        }
        obj = obter_Token();
        bloco(obj);
        i++;
        obj = obter_Token();
        if (obj.getConteudo().equals(".")) {
            System.out.println("BREAK! '.' não encontrado");
            return;
        }
    }

    public void bloco(Tokens obj) {
        if (obj.getConteudo().equals("tipo")) {
            declara_tipo(obj);
        }
        if (obj.getConteudo().equals("var")) {
            declara_var(obj);
        }
        /*while(){
            
        }*/
    }

    public boolean procedimento(Tokens obj) {

        return true;
    }

    public void declara_tipo(Tokens obj) {
        obj = obter_Token();
        do {
            if (obj.getTipo().equals("Identificador")) {
                System.out.println("BREAK! Identificador não encontrado");
                return;
            }
            obj = obter_Token();
            i++;
            if (obj.getConteudo().equals("=")) {
                System.out.println("BREAK! '=' não encontrado");
                return;
            }
            obj = obter_Token();
            i++;
            if (obj.getTipo().equals("Identificador")) {
                System.out.println("BREAK! Identificador não encontrado");
                return;
            }
            obj = obter_Token();
            i++;
            if (obj.getConteudo().equals(";")) {
                System.out.println("BREAK! ';' não encontrado");
                return;
            }
            obj = obter_Token();
            i++;
        } while (obj.getTipo().equals("Identificador"));
    }

    public void declara_var(Tokens obj) {
        obj = obter_Token();
        do {
            if (obj.getTipo().equals("Identificador")) {
                System.out.println("BREAK! Identificador não encontrado");
                return;
            }
            obj = obter_Token();
            i++;
            if (obj.getConteudo().equals(":")) {
                System.out.println("BREAK! ':' não encontrado");
                return;
            }
            obj = obter_Token();
            i++;
            if (obj.getTipo().equals("Identificador")) {
                System.out.println("BREAK! Identificador não encontrado");
                return;
            }
            obj = obter_Token();
            i++;
            if (obj.getConteudo().equals(";")) {
                System.out.println("BREAK! ';' não encontrado");
                return;
            }
            obj = obter_Token();
            i++;
        } while (obj.getTipo().equals("Identificador"));
    }
}
