package ImageHoster.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="userregister")
public class User {

    public User(){

    }

    @Id
    @Column
    private Integer id;
    @Column
    private String username;

    @Column
    private String password;

    //@Column
    //private UserProfile profile;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //public UserProfile getProfile() {
  //      return profile;
  //  }

    //public void setProfile(UserProfile profile) {
       // this.profile = profile;
    //}
}

