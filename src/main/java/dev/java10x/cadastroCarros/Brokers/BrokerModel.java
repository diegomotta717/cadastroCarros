package dev.java10x.cadastroCarros.Brokers;

import dev.java10x.cadastroCarros.Carros.CarrosModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tab_brokers")
@NoArgsConstructor
@AllArgsConstructor
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


}
