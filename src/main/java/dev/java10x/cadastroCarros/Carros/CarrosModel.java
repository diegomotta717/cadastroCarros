package dev.java10x.cadastroCarros.Carros;

import dev.java10x.cadastroCarros.Brokers.BrokerModel;
import dev.java10x.cadastroCarros.Drivers.DriverModel;
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

    public CarrosModel(Long id, String modelo, String orderid, String origem, String destino, Double valor, String prazoPagamento, String brokerNome, String dataPickup, String dataDelivery, String dataInvoice, String previsaoPagamento, String statusPagamento, String dataPagamento, Short quantidadeAtraso, String nomeCobrador, String anotacoesCobrador, String anotacoesDispatch, String nomeDispatcher, DriverModel drivers, BrokerModel brokers) {
        this.id = id;
        this.modelo = modelo;
        this.orderid = orderid;
        this.origem = origem;
        this.destino = destino;
        this.valor = valor;
        this.prazoPagamento = prazoPagamento;
        this.brokerNome = brokerNome;
        this.dataPickup = dataPickup;
        this.dataDelivery = dataDelivery;
        this.dataInvoice = dataInvoice;
        this.previsaoPagamento = previsaoPagamento;
        this.statusPagamento = statusPagamento;
        this.dataPagamento = dataPagamento;
        this.quantidadeAtraso = quantidadeAtraso;
        this.nomeCobrador = nomeCobrador;
        this.anotacoesCobrador = anotacoesCobrador;
        this.anotacoesDispatch = anotacoesDispatch;
        this.nomeDispatcher = nomeDispatcher;
        this.drivers = drivers;
        this.brokers = brokers;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getPrazoPagamento() {
        return prazoPagamento;
    }

    public void setPrazoPagamento(String prazoPagamento) {
        this.prazoPagamento = prazoPagamento;
    }

    public String getBrokerNome() {
        return brokerNome;
    }

    public void setBrokerNome(String brokerNome) {
        this.brokerNome = brokerNome;
    }

    public String getDataPickup() {
        return dataPickup;
    }

    public void setDataPickup(String dataPickup) {
        this.dataPickup = dataPickup;
    }

    public String getDataDelivery() {
        return dataDelivery;
    }

    public void setDataDelivery(String dataDelivery) {
        this.dataDelivery = dataDelivery;
    }

    public String getDataInvoice() {
        return dataInvoice;
    }

    public void setDataInvoice(String dataInvoice) {
        this.dataInvoice = dataInvoice;
    }

    public String getPrevisaoPagamento() {
        return previsaoPagamento;
    }

    public void setPrevisaoPagamento(String previsaoPagamento) {
        this.previsaoPagamento = previsaoPagamento;
    }

    public String getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(String statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Short getQuantidadeAtraso() {
        return quantidadeAtraso;
    }

    public void setQuantidadeAtraso(Short quantidadeAtraso) {
        this.quantidadeAtraso = quantidadeAtraso;
    }

    public String getNomeCobrador() {
        return nomeCobrador;
    }

    public void setNomeCobrador(String nomeCobrador) {
        this.nomeCobrador = nomeCobrador;
    }

    public String getAnotacoesCobrador() {
        return anotacoesCobrador;
    }

    public void setAnotacoesCobrador(String anotacoesCobrador) {
        this.anotacoesCobrador = anotacoesCobrador;
    }

    public String getAnotacoesDispatch() {
        return anotacoesDispatch;
    }

    public void setAnotacoesDispatch(String anotacoesDispatch) {
        this.anotacoesDispatch = anotacoesDispatch;
    }

    public String getNomeDispatcher() {
        return nomeDispatcher;
    }

    public void setNomeDispatcher(String nomeDispatcher) {
        this.nomeDispatcher = nomeDispatcher;
    }

    public DriverModel getDrivers() {
        return drivers;
    }

    public void setDrivers(DriverModel drivers) {
        this.drivers = drivers;
    }

    public BrokerModel getBrokers() {
        return brokers;
    }

    public void setBrokers(BrokerModel brokers) {
        this.brokers = brokers;
    }
}
