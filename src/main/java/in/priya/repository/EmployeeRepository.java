package in.priya.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.priya.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
