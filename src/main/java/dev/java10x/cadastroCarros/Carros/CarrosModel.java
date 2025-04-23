package dev.java10x.cadastroCarros.Carros;

import dev.java10x.cadastroCarros.Brokers.BrokerModel;
import dev.java10x.cadastroCarros.Drivers.DriverModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

//Entity transforma uma classe comum em uma entidade do BD
@Entity
@Table (name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
public class CarrosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String modelo;
    private String orderid;
    private String origem;
    private String destino;
    private Double valor;
    private String prazoPagamento;
    private String brokerNome;
    private String dataPickup;
    private String dataDelivery;
    private String dataInvoice;
    private String previsaoPagamento;
    private String statusPagamento;
    private String dataPagamento;
    private Short quantidadeAtraso;
    private String nomeCobrador;
    private String  anotacoesCobrador;
    private String anotacoesDispatch;
    private String nomeDispatcher;

    // na classe carros podemos ter um único driver

    @ManyToOne

    @JoinColumn(name="drivers_id") //foreing key ou chave estrangeira
    private DriverModel drivers;

    @JoinColumn(name="broker_id")
    private BrokerModel brokers;


}
