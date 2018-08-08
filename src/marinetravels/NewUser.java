/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marinetravels;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Versha
 */
@Entity
@Table(name = "new_user")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "NewUser.findAll", query = "SELECT n FROM NewUser n"),
    @NamedQuery(name = "NewUser.findByUserid", query = "SELECT n FROM NewUser n WHERE n.userid = :userid"),
    @NamedQuery(name = "NewUser.findByPassword", query = "SELECT n FROM NewUser n WHERE n.password = :password")})
public class NewUser implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "userid")
    private String userid;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;

    public NewUser() {
    }

    public NewUser(String userid) {
        this.userid = userid;
    }

    public NewUser(String userid, String password) {
        this.userid = userid;
        this.password = password;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (userid != null ? userid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NewUser)) {
            return false;
        }
        NewUser other = (NewUser) object;
        if ((this.userid == null && other.userid != null) || (this.userid != null && !this.userid.equals(other.userid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cruisevoyage.NewUser[ userid=" + userid + " ]";
    }
    
}
