package models.users;

import models.department.Department;
import models.project.Project;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;


@Table(name="Manager")
// the user type of this class is "admin"
@DiscriminatorValue("m")
@Entity
public class Manager extends User {


    @Constraints.Required
    private String jobRole;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="address_id")
    private Address address;

    // One manager per project. Managers can manage multiple projects.
    @OneToMany
    private List<Project> projects = new ArrayList<>();

    //One Manager can be in charge of one department
    @OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "dept")
    private Department dept;

    public Manager(){

    }

    public Manager(Long id, String jobRole, Address address, Department dept, String email, String name, String role, String password, Date dateOfBirth){
	    super(id, email, name, role, password, dateOfBirth);
        // role here (in context means role within system eg; admin, manager, normal employee) coming from User might cause confusion with jobRole
        // jobRole will be important if we want to look at some specific billing rates etc. for different job types eg - designers / developers / QA etc
        this.jobRole = jobRole;
        this.dept = dept;
    }


    private List<Manager> projSelect = new ArrayList<Manager>();


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJobRole(){
        return jobRole;
    }

    public void setJobRole(String jobRole){
        this.jobRole = jobRole;
    }

    public Address getAddress(){
        return address;
    }

    public void setAddress(Address address){
        this.address = address;
    }

    public List<Project> getProjects(){
        return projects;
    }

    public void setProjects(List<Project> projects){
        this.projects = projects;
    }

    public Department getDepartment(){
        return dept;
    }

    public void setDepartment(Department dept){
        this.dept = dept;
    }


    
    public static final Finder<Long, Manager> find = new Finder<>(Manager.class);
			    
    public static final List<Manager> findAll() {
       return Manager.find.all();
    }
}
