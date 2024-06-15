package Intermediate_Project;

import java.util.*;

//Employee class representing each employee
class Employee {
 private int id;
 private String name;
 private String position;

 // Constructor
 public Employee(int id, String name, String position) {
     this.id = id;
     this.name = name;
     this.position = position;
 }

 // Getters and setters
 public int getId() {
     return id;
 }

 public void setId(int id) {
     this.id = id;
 }

 public String getName() {
     return name;
 }

 public void setName(String name) {
     this.name = name;
 }

 public String getPosition() {
     return position;
 }

 public void setPosition(String position) {
     this.position = position;
 }

 // toString method to display employee information
 @Override
 public String toString() {
     return "Employee ID: " + id + ", Name: " + name + ", Position: " + position;
 }
}

//Main EmployeeManagementApp class
public class EmployeeManagementSystem {
 private List<Employee> employeeList = new ArrayList<>();
 private int nextId = 1;

 // Method to add a new employee
 public void addEmployee(String name, String position) {
     Employee newEmployee = new Employee(nextId, name, position);
     employeeList.add(newEmployee);
     nextId++;
 }

 // Method to view all employees
 public void viewAllEmployees() {
     System.out.println("List of Employees:");
     for (Employee emp : employeeList) {
         System.out.println(emp);
     }
 }

 // Method to update employee details
 public void updateEmployee(int id, String newName, String newPosition) {
     for (Employee emp : employeeList) {
         if (emp.getId() == id) {
             emp.setName(newName);
             emp.setPosition(newPosition);
             System.out.println("Employee details updated successfully.");
             return;
         }
     }
     System.out.println("Employee not found with ID: " + id);
 }

 // Method to delete an employee
 public void deleteEmployee(int id) {
     Iterator<Employee> iterator = employeeList.iterator();
     while (iterator.hasNext()) {
         Employee emp = iterator.next();
         if (emp.getId() == id) {
             iterator.remove();
             System.out.println("Employee deleted successfully.");
             return;
         }
     }
     System.out.println("Employee not found with ID: " + id);
 }

 // Main method to test the EmployeeManagementApp
 public static void main(String[] args) {
     EmployeeManagementSystem app = new EmployeeManagementSystem();

     // Adding some initial employees
     app.addEmployee("John Doe", "Software Developer");
     app.addEmployee("Jane Smith", "HR Manager");

     // Viewing all employees
     app.viewAllEmployees();

     // Updating an employee
     app.updateEmployee(1, "John Doe Jr.", "Senior Software Developer");

     // Viewing all employees after update
     app.viewAllEmployees();

     // Deleting an employee
     app.deleteEmployee(2);

     // Viewing all employees after delete
     app.viewAllEmployees();
 }
}
