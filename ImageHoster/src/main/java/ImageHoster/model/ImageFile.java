package ImageHoster.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by vaibhavhajela on 16/01/21.
 */
@Entity
@Table(name="files")
public class ImageFile {
    public ImageFile(){

    }


    public ImageFile(String id, String title, String description, byte[] filedata) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.filedata = filedata;
    }
    public ImageFile(String title, String description, byte[] filedata) {
        this.title = title;
        this.description = description;
        this.filedata = filedata;
    }

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;



    @Column
    private String title;

    @Column
    private String description;

    @Override
    public String toString() {
        return "ImageFile{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", filedata=" + Arrays.toString(filedata) +
                '}';
    }

    @Column(name="data")
    @Lob
    private byte[] filedata;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte[] getFiledata() {
        return filedata;
    }

    public void setFiledata(byte[] filedata) {
        this.filedata = filedata;
    }


}
