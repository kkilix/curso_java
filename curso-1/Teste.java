class Empresa{
    private String nome;
    private String cnpj;
    private Funcionario[] funcionarios;
    
    public Empresa(int qtdeFuncionarios) {
        funcionarios = new Funcionario[qtdeFuncionarios];
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj (String cnpj) {
        this.cnpj = cnpj;
    }

    public Funcionario getFuncionario(int posicao) {
        return this.funcionarios[posicao];
    }

    public void adiciona(Funcionario f) {
        for (int i = 0; i < this.funcionarios.length; i++) {
            if(this.funcionarios[i] == null) {
                this.funcionarios[i] = f;
                break;
            }
        }
    }

    public void mostraEmpregados() {
        for(Funcionario f: this.funcionarios) {
            System.out.println("R$" + f.getSalario());
        }
    }

    public void mostraTodasAsInformacoes() {
        for(Funcionario f: this.funcionarios) {
            f.mostra();
        }
    }

    public boolean contem(Funcionario f) {
        boolean achou = false;

        for (int i = 0; i < this.funcionarios.length; i++) {
            if(this.funcionarios[i] == f) {
                achou = true;
                break;
            }
        }

        return achou;
    }
}

class Data {
    int dia;
    int mes;
    int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

        if (!isDataViavel(dia, mes, ano)) {
            System.out.println("A data " + getFormatada() + " não existe!");
        }
    }

    private boolean isDataViavel(int dia, int mes, int ano) {
        if (dia <= 0 || mes <= 0 || mes > 12 || ano <= 0) {
            return false;
        }

        int ultimoDiaDoMes = 31; // por padrao são 31 dias
        if (mes == 4 || mes == 6 || mes == 9 || mes == 11 ) {
            ultimoDiaDoMes = 30;
        } else if (mes == 2) {
            ultimoDiaDoMes = 28;
            if((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))){
                ultimoDiaDoMes = 29;
            }
        }
        if (dia > ultimoDiaDoMes) {
            return false;
        }

        return true;
    }

    String getFormatada() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
}

class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    private Data dataEntrada;
    private String rg;
    private static int proximoFuncionario = 0;
    private int identificador;
    

    public Funcionario(String nome) {
        this.nome = nome;
        this.identificador = ++proximoFuncionario;
    }

    public Funcionario() {}

    public int getIdentificador() {
        return this.identificador;
    }

    public double getGanhoAnual() {
        return this.salario * 12;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento (String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario (double salario) {
        this.salario = salario;
    }

    public Data getDataEntrada() {
        return this.dataEntrada;
    }

    public void setDataEntrada (Data dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getRg() {
        return this.rg;
    }

    public void imprimeSalario() {
        System.out.println("salario atual:" + this.salario);
    }

    public void mostra() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Departamento: " + this.departamento);
        System.out.println("Salário: " + this.salario);
        System.out.println("Data de Entrada: " + this.dataEntrada.getFormatada());
        System.out.println("RG: " + this.rg);
        System.out.println("Ganho anual: " + getGanhoAnual());
    }
}

/*class TestaEmpresa {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        
        for (int i = 0; i < 10; i++) {
            Funcionario f = new Funcionario();
            f.salario = 1000 + i * 100;
            empresa.adiciona(f);
        }

        //empresa.mostraEmpregados();
        empresa.mostraTodasAsInformacoes();
    }
}*/

class TestaFuncionario {
    public static void main(String args[]) {
        Funcionario f1 = new Funcionario();        
        f1.setNome("Hugo");
        f1.setSalario(100);
        //f1.recebeAumento(50);

        Data d = new Data(1, 7, 2009);
        f1.setDataEntrada(d);

        f1.mostra();
    }
}