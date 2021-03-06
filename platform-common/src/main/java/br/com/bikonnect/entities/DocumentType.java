package br.com.bikonnect.entities;


import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by danilopereira on 20/07/17.
 */
@Entity
@Table(name = "document_type")
public class DocumentType implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
