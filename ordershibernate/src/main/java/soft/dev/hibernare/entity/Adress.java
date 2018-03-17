package soft.dev.hibernare.entity;

import javax.persistence.*;


@Entity
@Table(name = "adress")
public class Adress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String street;
    private String postal;
    private String city;









}
