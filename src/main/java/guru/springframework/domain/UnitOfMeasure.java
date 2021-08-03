package guru.springframework.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class UnitOfMeasure extends AbstractEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
