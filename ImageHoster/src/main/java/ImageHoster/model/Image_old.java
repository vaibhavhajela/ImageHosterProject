package ImageHoster.model;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="image")
public class Image_old
{

    @Id
    @Column
    private Integer id;
    @Column
    private String title;
    @Lob
    @Column(name="data")
    private String imagedata;
    @Column
    private String description;
    @Column
    private Date date;

    public Image_old(Integer id, String title, String imageFile, Date date) {
        this.id = id;
        this.title = title;
        this.imagedata = imageFile;
        this.date = date;
    }

    public Image_old(Integer id, String title, String imageFile, String description, Date date) {
        this.id = id;
        this.title = title;
        this.imagedata = imageFile;
        this.description = description;
        this.date = date;
    }

    public Image_old() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImageFile() {
        return imagedata;
    }

    public void setImageFile(String imageFile) {
        this.imagedata = imageFile;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
