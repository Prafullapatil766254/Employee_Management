package com.example.Controller;

import com.example.Model.Attendance;
import com.example.Model.Employee;
import com.example.Service.AttendanceService;
import com.example.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/attendance")
public class AttendanceController {
    @Autowired
    AttendanceService attendanceService;
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/record")
    public Attendance recordAttendance(@RequestBody Attendance attendance) {
        return attendanceService.recordAttendance(attendance);
    }


    @GetMapping("/employee/{employeeId}")
    public List<Attendance> getAttendanceByEmployee(@PathVariable Long employeeId) {
        Optional<Employee> employee = employeeService.getEmployeeById(employeeId);
        return attendanceService.getAttendanceByEmployee(employee);
    }

}