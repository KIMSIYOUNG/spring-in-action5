package spring.in.actiontaco.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;
import lombok.Data;

@Data
@Entity
public class Taco {
    @Id
    @GeneratedValue
    private Long id;
    private LocalDateTime createdAt;

    @NotNull
    @Size(min = 5, message = "Name muset be at least 5 characters long")
    private String name;

    @ManyToMany(targetEntity = Ingredient.class)
    @Size(min = 1, message = "You must choose at least 1 ingredient")
    private List<String> ingredients;

    @PrePersist
    void createAt() {
        this.createdAt = LocalDateTime.now();
    }
}
