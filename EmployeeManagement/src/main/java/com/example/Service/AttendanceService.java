package com.example.Service;

import com.example.Model.Attendance;
import com.example.Model.Employee;
import com.example.Repository.IAttendance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AttendanceService {
    private final IAttendance attendanceRepository;

    @Autowired
    public AttendanceService(IAttendance attendanceRepository) {
        this.attendanceRepository = attendanceRepository;
    }


    public Attendance recordAttendance(Attendance attendance) {

        return attendanceRepository.save(attendance);
    }

    public List<Attendance> getAttendanceByEmployee(Optional<Employee> employee) {

        return attendanceRepository.findByEmployee(employee);
    }


}