package weiling.javaDemo.liquibase.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name = "users")
@Entity
public class UsersDO  {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "user_id")
    private String userId;


    @Column(name = "user_name")
    private String username;


}
