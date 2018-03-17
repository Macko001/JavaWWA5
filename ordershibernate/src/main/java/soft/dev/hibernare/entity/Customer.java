package soft.dev.hibernare.entity;


import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(name="fist_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name = "login")
    private String login;


    @Column(name= "type")
    @Enumerated(EnumType.STRING)
    private CustomerType type;


    public Customer(){
    @OneToOne
    @JoinColumn(name = "adress_id")
        private Adress adress;


    }


    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getLogin() {
        return login;
    }

    public CustomerType getType() {
        return type;
    }
}
