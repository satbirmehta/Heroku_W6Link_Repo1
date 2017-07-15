package com.example.demo;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Collection;

/**
 * Created by student on 6/28/17.
 */
@Entity
@Table(name = "userData")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Size(min=6)
    private String password;


    @NotNull
    @Column(unique = true)
    @Size(max=50)
    private String email;

    @NotNull
    @Column(unique = true)
    @Size(min=2,max=50)
    private String username;

    @Size(max=50)
    @NotNull
    private String roleName;

    @NotNull
    @Size(min=2,max=100)
    private String firstName;

    @NotNull
    @Size(min=2,max=100)
    private String lastName;

    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(joinColumns = @JoinColumn(name = "user_id"),inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Collection<Role> roles;

    private boolean enabled;

    public User(String email,String password,  String firstName, String lastName, boolean enabled, String username, String roleName) {
        this.password = password;
        this.email = email;
        this.username = username;
        this.roleName = roleName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.enabled = enabled;
    }

    public User()
    {


    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Collection<Role> getRoles() {
        return roles;
    }

    public void setRoles(Collection<Role> roles) {
        this.roles = roles;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}