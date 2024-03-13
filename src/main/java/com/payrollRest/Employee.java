package com.payrollRest;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
class Employee {

    private @Id @GeneratedValue Long id;
    private String name;
    private String role;

    public Employee() {
    }

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return this.name;
    }

    public String getRole() {
        return role;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.role);
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj){
            return true;
        }

        if (!(obj instanceof Employee)){
            return false;
        }

        Employee employee = (Employee) obj;

        return this.id.equals(employee.id)
                && this.name.equals(employee.name)
                && this.role.equals(employee.role);
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + this.id +
                ", name='" + this.name + '\'' +
                ", role='" + this.role + '\'' + '}';
    }
}
