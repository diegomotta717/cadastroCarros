package dev.java10x.cadastroCarros.Drivers;

import dev.java10x.cadastroCarros.Carros.CarrosModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tab_driver")
@NoArgsConstructor
@AllArgsConstructor
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


}



