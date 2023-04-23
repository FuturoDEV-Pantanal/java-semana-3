package aula_3.revisao_a.entities;

public class FuncionarioTerc extends Funcionario {

        private Double despesaAdicional;

        public FuncionarioTerc(String nome, Integer horas, Double valorPorHora, Double despesaAdicional){
            super(nome, horas, valorPorHora);
            this.despesaAdicional = despesaAdicional;
        }

        public Double getDespesaAdicional() {
            return despesaAdicional;
        }
    
        public void setDespesaAdicional(Double despesaAdicional) {
            this.despesaAdicional = despesaAdicional;
        }

        @Override
        public Double pagamento(){
                    //ta chamando o método pagamento() da classe mãe (superior) com
                    // o método super.
            return  super.pagamento() + super.pagamento() * despesaAdicional;

        }

}