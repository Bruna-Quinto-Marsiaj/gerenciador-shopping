public class Loja {

    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;

    private Endereco endereco;

    private Data dataFundacao;

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao) {
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;

    }

    @Override
    public String toString() {
        return "Loja [nome=" + nome + ", quantidadeFuncionarios=" + quantidadeFuncionarios + ", salarioBaseFuncionario=" + salarioBaseFuncionario + "]";
    }

    public double gastosComSalario() {
        if (salarioBaseFuncionario == -1) {
            return -1; // Retorna -1 se o salário base for -1
        } else {
            return quantidadeFuncionarios * salarioBaseFuncionario;

        }
    }


        public char tamanhoDaLoja () {
            if (quantidadeFuncionarios < 10) {
                return 'P'; // Retorna 'P' para lojas com menos de 10 funcionários
            } else if (quantidadeFuncionarios >= 10 && quantidadeFuncionarios <= 30) {
                return 'M'; // Retorna 'M' para lojas com 10 a 30 funcionários (inclusive)
            } else {
                return 'G'; // Retorna 'G' para lojas com mais de 30 funcionários
            }
        }
    }

