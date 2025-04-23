package dev.java10x.cadastroCarros.Brokers;

import dev.java10x.cadastroCarros.Carros.CarrosModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tab_brokers")

public class BrokerModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String brokerName;
    private String brokerAddress;
    private String brokerPhone;
    private String brokerDesconto;
    private String brokerEmail;

    @OneToMany (mappedBy = "brokers")

    private List<CarrosModel> carros;

    public BrokerModel(Long id, String brokerName, String brokerAddress, String brokerPhone, String brokerDesconto, String brokerEmail, List<CarrosModel> carros) {
        this.id = id;
        this.brokerName = brokerName;
        this.brokerAddress = brokerAddress;
        this.brokerPhone = brokerPhone;
        this.brokerDesconto = brokerDesconto;
        this.brokerEmail = brokerEmail;
        this.carros = carros;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrokerName() {
        return brokerName;
    }

    public void setBrokerName(String brokerName) {
        this.brokerName = brokerName;
    }

    public String getBrokerAddress() {
        return brokerAddress;
    }

    public void setBrokerAddress(String brokerAddress) {
        this.brokerAddress = brokerAddress;
    }

    public String getBrokerPhone() {
        return brokerPhone;
    }

    public void setBrokerPhone(String brokerPhone) {
        this.brokerPhone = brokerPhone;
    }

    public String getBrokerDesconto() {
        return brokerDesconto;
    }

    public void setBrokerDesconto(String brokerDesconto) {
        this.brokerDesconto = brokerDesconto;
    }

    public String getBrokerEmail() {
        return brokerEmail;
    }

    public void setBrokerEmail(String brokerEmail) {
        this.brokerEmail = brokerEmail;
    }

    public List<CarrosModel> getCarros() {
        return carros;
    }

    public void setCarros(List<CarrosModel> carros) {
        this.carros = carros;
    }
}
