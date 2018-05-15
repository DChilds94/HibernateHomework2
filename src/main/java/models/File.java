package models;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name="file")
public class File {
    private int id;
    private String name;
    private String type;
    private int size;
    private Folder folder;

    public File(String name, String type, int size, Folder folder) {
        this.name = name;
        this.type = type;
        this.size = size;
        this.folder = folder;
    }

    public File(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name="type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Column(name="size")
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @ManyToOne
    @JoinColumn(name="folder_id", nullable = false)
    public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }
}
