package guru.springframework.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

@Data
@Entity
public class Notes extends AbstractEntity {

    @OneToOne
    private Recipe recipe;

    @Lob // LargeObject - signifies that the annotated field should be represented as BLOB (binary data) in the DataBase
    private String recipeNotes;
}
