package dev.java10x.cadastroCarros;

import jakarta.persistence.*;

//Entity transforma uma classe comum em uma entidade do BD
@Entity
@Table (name = "tb_cadastro")
public class CarrosModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String modelo;
    private String orderid;
    private String origem;
    private String destino;
    private Double valor;
    private String brokerNome;
    private String dataPickup;
    private String dataDelivery;
    private String dataInvoice;
    private String prazoPagamento;
    private String previsaoPagamento;
    private String statusPagamento;
    private String dataPagamento;
    private Short quantidadeAtraso;
    private String driverName;
    private String anotacoes;

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

    public Long getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public String getOrderid() {
        return orderid;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public Double getValor() {
        return valor;
    }

    public String getBrokerNome() {
        return brokerNome;
    }

    public String getDataPickup() {
        return dataPickup;
    }

    public String getDataDelivery() {
        return dataDelivery;
    }

    public String getDataInvoice() {
        return dataInvoice;
    }

    public String getPrazoPagamento() {
        return prazoPagamento;
    }

    public String getPrevisaoPagamento() {
        return previsaoPagamento;
    }

    public String getStatusPagamento() {
        return statusPagamento;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public Short getQuantidadeAtraso() {
        return quantidadeAtraso;
    }

    public String getDriverName() {
        return driverName;
    }

    public String getAnotacoes() {
        return anotacoes;
    }
}
