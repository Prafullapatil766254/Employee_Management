package com.example.Repository;

import com.example.Model.Attendance;
import com.example.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface IAttendance extends JpaRepository<Attendance, Long> {

    List<Attendance> findByEmployee(Optional<Employee> employee);

    List<Attendance> findByEmployeeIdAndDateBetween(Long employeeId, LocalDate startDate, LocalDate endDate);
}
