package MerkMobil.API.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "merk_mobil")
public class MerkMobil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String namaMerk;
    
    private String negaraAsal;

    @Column(name = "tahun_didirikan")
    private int tahunDidirikan;
    private String deskripsi;

    // Getter dan Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNamaMerk() {
        return namaMerk;
    }

    public void setNamaMerk(String namaMerk) {
        this.namaMerk = namaMerk;
    }

    public String getNegaraAsal() {
        return negaraAsal;
    }

    public void setNegaraAsal(String negaraAsal) {
        this.negaraAsal = negaraAsal;
    }

    public int getTahunDidirikan() {
        return tahunDidirikan;
    }

    public void setTahunDidirikan(int tahunDidirikan) {
        this.tahunDidirikan = tahunDidirikan;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
}
