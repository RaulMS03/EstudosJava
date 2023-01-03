public class Mercadinho {

    public static void main(String[] args) {

    	// Primeira tentativa de alta no estoque
    	try { // fazendo com que o ccdigo tente ser rodado
        	System.out.println("Bem vindo ao MercaSul!");
        	int codigoProduto = 199;
        	String nomeProduto = "pera";
        	if(validaCodigoProduto(codigoProduto))
        		adicionaProduto(codigoProduto, nomeProduto);
        } catch (codigoProdutoException e) { // capturando a exce��o
        	System.out.println(e.getMessage());
        } finally { // sempre informa o que vai no finally
        	System.out.println("Bom trabalho!");
			System.out.println("------------------");
        }

    	// Segunda tentativa de alta no estoque
        try {
        	System.out.println("Bem vindo ao MercaSul!");
        	int codigoProduto = 1;
        	String nomeProduto = "465";
        	if(nomeProduto.matches("[0-9]+"))
        		throw new nomeProdutoInvalidoException();
        	if(validaCodigoProduto(codigoProduto))
        		adicionaProduto(codigoProduto, nomeProduto);
        } catch (codigoProdutoException e) {
        	System.out.println(e.getMessage());
        } catch (mercadinhoException e) {
        	System.out.println(e.retornaMsgExcecao());
		} finally {
        	System.out.println("Bom trabalho!");
			System.out.println("------------------");
        }
        
    	// Terceira tentativa de alta no estoque
        try {
        	System.out.println("Bem vindo ao MercaSul!");
        	int codigoProduto = -1;
        	String nomeProduto = "maca gala";
        	if(nomeProduto.matches("[0-9]+"))
        		throw new nomeProdutoInvalidoException();
        	if(validaCodigoProduto(codigoProduto))
        		adicionaProduto(codigoProduto, nomeProduto);
        } catch (codigoProdutoException e) {
        	System.out.println(e.getMessage());
        } catch (mercadinhoException e) {
        	System.out.println(e.retornaMsgExcecao());
		} finally {
        	System.out.println("Bom trabalho!");
			System.out.println("------------------");
		}
        
    	// Quarta tentativa de alta no estoque
        try {
        	System.out.println("Bem vindo ao MercaSul!");
        	int codigoProduto = 1;
        	String nomeProduto = "maca gala";
        	if(nomeProduto.matches("[0-9]+"))
        		throw new nomeProdutoInvalidoException();
        	if(validaCodigoProduto(codigoProduto))
        		adicionaProduto(codigoProduto, nomeProduto);
        } catch (codigoProdutoException e) {
        	System.out.println(e.getMessage());
        } catch (mercadinhoException e) {
        	System.out.println(e.retornaMsgExcecao());
		} finally {
        	System.out.println("Bom trabalho!");
			System.out.println("------------------");
		}
    }
    
	// Metodo responsavel por validar o codigo do produto e ver se o mesmo atende as regras de negoco
    public static boolean validaCodigoProduto(int codigoProduto) throws codigoProdutoException {
    	if (codigoProduto < 1)
    		throw new codigoMenorQueZeroException();
    	else if (codigoProduto > 99)
    		throw new codigoDeProdutoMuitoGrandeException();
    	else 
    		return true;
    }
    
	// Metodo responsavel por adicionar um produto ao estoque
    public static void adicionaProduto(int codigoProduto, String nomeProduto) {
    	String produtos[] = new String[100];
    	produtos[codigoProduto] = nomeProduto;
    	System.out.printf("Sucesso ao inserir o produto %s.\n", produtos[codigoProduto]);
    } 
}

// Classe de exception principal do codigo do produto
class codigoProdutoException extends ArrayIndexOutOfBoundsException {
    private String msg;
    
    public codigoProdutoException(String msg){
      super(msg);
      this.msg = msg;
    }
    
    public String retornaMsgExcecao(){
        return msg;
     }    
}

// subclasse de exception que herda caracteristicas do codigoProdutoException
class codigoMenorQueZeroException extends codigoProdutoException {
    public codigoMenorQueZeroException(){
        super("Valor de codigo invalido. Nao existe codigo de produto negativo ou igual a zero.");
    }
}

// subclasse de exception que herda caracteristicas do codigoProdutoException
class codigoDeProdutoMuitoGrandeException extends codigoProdutoException {
    public codigoDeProdutoMuitoGrandeException(){
        super("Codigo de produto muito grande. O valor do codigo ultrapassa 2 digitos, por favor escolha outro produto ou altere o codigo.");
    }
}

// Classe de exception principal do mercadinho
class mercadinhoException extends Exception {
    private String msg;
    
    public mercadinhoException(String msg){
      super(msg);
      this.msg = msg;
    }
    
    public String retornaMsgExcecao(){
      return msg;
    }
}

// subclasse de exception que herda caracteristicas do mercadinhoException
class nomeProdutoInvalidoException extends mercadinhoException{
    public nomeProdutoInvalidoException(){
      super("O nome de produto e invalido. Nao e aceito apenas numeros no nome.");
    }
}