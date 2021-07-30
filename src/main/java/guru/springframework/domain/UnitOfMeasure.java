package guru.springframework.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Data
@Entity
public class UnitOfMeasure extends AbstractEntity {

    private String description;
}
