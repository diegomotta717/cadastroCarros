package dev.java10x.cadastroCarros.Drivers;

import dev.java10x.cadastroCarros.Carros.CarrosModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tab_driver")

public class DriverModel {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeDriver;
    private String enderecoDriver;
    private Double valorDispatch;
    private Boolean cdl;
    private Boolean twic;
    private String idadeDriver;
    private String tipoSanguineo;
    private Byte quantidadeDamage;
    private String telefoneDriver;
    private String telefoneParente;
    private String driverEmail;
    private String nomeBanco;
    private String routeNumber;
    private String accNumber;
    private String accTitular;
    private String accType;
    private String bankAdress;
    private String zelleInfo;
    private String zelleTitular;
    private String dataCadastroDriver;

    //um driver pode ter vários carros
    @OneToMany (mappedBy = "drivers")

    private List<CarrosModel> carros;

    public DriverModel(Long id, String nomeDriver, String enderecoDriver, Double valorDispatch, Boolean cdl, Boolean twic, String idadeDriver, String tipoSanguineo, Byte quantidadeDamage, String telefoneParente, String telefoneDriver, String driverEmail, String nomeBanco, String routeNumber, String accNumber, String accTitular, String accType, String bankAdress, String zelleInfo, String zelleTitular, String dataCadastroDriver, List<CarrosModel> carros) {
        this.id = id;
        this.nomeDriver = nomeDriver;
        this.enderecoDriver = enderecoDriver;
        this.valorDispatch = valorDispatch;
        this.cdl = cdl;
        this.twic = twic;
        this.idadeDriver = idadeDriver;
        this.tipoSanguineo = tipoSanguineo;
        this.quantidadeDamage = quantidadeDamage;
        this.telefoneParente = telefoneParente;
        this.telefoneDriver = telefoneDriver;
        this.driverEmail = driverEmail;
        this.nomeBanco = nomeBanco;
        this.routeNumber = routeNumber;
        this.accNumber = accNumber;
        this.accTitular = accTitular;
        this.accType = accType;
        this.bankAdress = bankAdress;
        this.zelleInfo = zelleInfo;
        this.zelleTitular = zelleTitular;
        this.dataCadastroDriver = dataCadastroDriver;
        this.carros = carros;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeDriver() {
        return nomeDriver;
    }

    public void setNomeDriver(String nomeDriver) {
        this.nomeDriver = nomeDriver;
    }

    public String getEnderecoDriver() {
        return enderecoDriver;
    }

    public void setEnderecoDriver(String enderecoDriver) {
        this.enderecoDriver = enderecoDriver;
    }

    public Double getValorDispatch() {
        return valorDispatch;
    }

    public void setValorDispatch(Double valorDispatch) {
        this.valorDispatch = valorDispatch;
    }

    public Boolean getCdl() {
        return cdl;
    }

    public void setCdl(Boolean cdl) {
        this.cdl = cdl;
    }

    public Boolean getTwic() {
        return twic;
    }

    public void setTwic(Boolean twic) {
        this.twic = twic;
    }

    public String getIdadeDriver() {
        return idadeDriver;
    }

    public void setIdadeDriver(String idadeDriver) {
        this.idadeDriver = idadeDriver;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public Byte getQuantidadeDamage() {
        return quantidadeDamage;
    }

    public void setQuantidadeDamage(Byte quantidadeDamage) {
        this.quantidadeDamage = quantidadeDamage;
    }

    public String getTelefoneDriver() {
        return telefoneDriver;
    }

    public void setTelefoneDriver(String telefoneDriver) {
        this.telefoneDriver = telefoneDriver;
    }

    public String getTelefoneParente() {
        return telefoneParente;
    }

    public void setTelefoneParente(String telefoneParente) {
        this.telefoneParente = telefoneParente;
    }

    public String getDriverEmail() {
        return driverEmail;
    }

    public void setDriverEmail(String driverEmail) {
        this.driverEmail = driverEmail;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public String getRouteNumber() {
        return routeNumber;
    }

    public void setRouteNumber(String routeNumber) {
        this.routeNumber = routeNumber;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public String getAccTitular() {
        return accTitular;
    }

    public void setAccTitular(String accTitular) {
        this.accTitular = accTitular;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public String getBankAdress() {
        return bankAdress;
    }

    public void setBankAdress(String bankAdress) {
        this.bankAdress = bankAdress;
    }

    public String getZelleInfo() {
        return zelleInfo;
    }

    public void setZelleInfo(String zelleInfo) {
        this.zelleInfo = zelleInfo;
    }

    public String getZelleTitular() {
        return zelleTitular;
    }

    public void setZelleTitular(String zelleTitular) {
        this.zelleTitular = zelleTitular;
    }

    public String getDataCadastroDriver() {
        return dataCadastroDriver;
    }

    public void setDataCadastroDriver(String dataCadastroDriver) {
        this.dataCadastroDriver = dataCadastroDriver;
    }

    public List<CarrosModel> getCarros() {
        return carros;
    }

    public void setCarros(List<CarrosModel> carros) {
        this.carros = carros;
    }
}



