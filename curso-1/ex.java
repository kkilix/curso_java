class Empresa{

        String nome;
        String cnpj;
        Funcionario[] funcionarios;

        void adicionar(Funcionario f){
            int posicao = 0;
            while(posicao < funcionarios.length) {
                if(this.funcionarios[posicao] == null) {
                    this.funcionarios[posicao] = f;
                    break;
                }
                posicao++;
            }
        }

        void mostraEmpregados(){
            for (int i=0; i<this.funcionarios.length; i++){
                System.out.println("Nome: " + this.funcionarios[i].nome);
                System.out.println("Funcionario na posiçao "+i);
                System.out.println("Salario: " + this.funcionarios[i].salario);
                System.out.println("RG: " + this.funcionarios[i].rg);
            }
        }

        void mostraTodasAsInformacoes(){
            for (int i=0; i<this.funcionarios.length; i++){
                this.funcionarios[i].mostra();
            }
        }

        boolean contem(Funcionario f){

            boolean existe= true;

            for (int i=0; i < this.funcionarios.length; i++){
                if(this.funcionarios[i]==f){
                    existe=true;
                    System.out.println("Existe");
                }else {
                    existe= false;
                    System.out.println("Nao Existe");
                }
            }
      }

 }
class TestaEmpresa{
    public static void main(String[]args){

        Empresa bolsao= new Empresa();
        bolsao.funcionarios= new Funcionario[10];

        Funcionario bilbo= new Funcionario();
        bilbo.nome= "Bilbo Baggins";
        bilbo.salario= 12000;
        bilbo.rg= "1234";
        bilbo.dataEntrada= new Data();
        bilbo.dataEntrada.preencheData(3,4,1239);
        bolsao.adicionar(bilbo);

        Funcionario pipin= new Funcionario();
        pipin.nome= "Peregrin Tuc";
        pipin.salario=300;
        pipin.rg="4321";
        pipin.dataEntrada= new Data();
        pipin.dataEntrada.preencheData(23,6,1367);
        bolsao.adicionar(pipin);

        Funcionario sam= new Funcionario();
        sam.nome= "Samwise";
        sam.salario=800;
        sam.rg="2143";
        sam.dataEntrada= new Data();
        sam.dataEntrada.preencheData(3,6,2016);
        bolsao.adicionar(sam);

        bolsao.mostraTodasAsInformacoes();
    }
}