package learn.microservice.DepartmentService.Repository;

import learn.microservice.DepartmentService.Model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface departmentRepository extends JpaRepository<Department,Long> {
    Department findByDepartmentId(Long departmentId);
}
