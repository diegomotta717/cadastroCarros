package dev.java10x.cadastroCarros;

import jakarta.persistence.*;

//Entity transforma uma classe comum em uma entidade do BD
@Entity
@Table (name = "tb_cadastro")
public class CarrosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String modelo;
    String orderid;
    String origem;
    String destino;
    Double valor;
    String brokerNome;
    String dataPickup;
    String dataDelivery;
    String dataInvoice;
    String prazoPagamento;
    String previsaoPagamento;
    String statusPagamento;
    String dataPagamento;
    Short quantidadeAtraso;
    String driverName;
    String anotacoes;

    public CarrosModel(String modelo, String orderid, String origem, String destino, Double valor, String brokerNome, String dataPickup, String dataDelivery, String dataInvoice, String prazoPagamento, String previsaoPagamento, String statusPagamento, String dataPagamento, Short quantidadeAtraso, String driverName, String anotacoes) {
        this.modelo = modelo;
        this.orderid = orderid;
        this.origem = origem;
        this.destino = destino;
        this.valor = valor;
        this.brokerNome = brokerNome;
        this.dataPickup = dataPickup;
        this.dataDelivery = dataDelivery;
        this.dataInvoice = dataInvoice;
        this.prazoPagamento = prazoPagamento;
        this.previsaoPagamento = previsaoPagamento;
        this.statusPagamento = statusPagamento;
        this.dataPagamento = dataPagamento;
        this.quantidadeAtraso = quantidadeAtraso;
        this.driverName = driverName;
        this.anotacoes = anotacoes;
    }
}
