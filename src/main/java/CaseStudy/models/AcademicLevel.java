package CaseStudy.models;

import javax.persistence.*;

@Entity
@Table(name = "levels")
public class AcademicLevel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nameLevel;
    private String specialized;

    public AcademicLevel() {
    }

    public AcademicLevel(String nameLevel, String specialized) {
        this.nameLevel = nameLevel;
        this.specialized = specialized;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameLevel() {
        return nameLevel;
    }

    public void setNameLevel(String nameLevel) {
        this.nameLevel = nameLevel;
    }

    public String getSpecialized() {
        return specialized;
    }

    public void setSpecialized(String specialized) {
        this.specialized = specialized;
    }
}
