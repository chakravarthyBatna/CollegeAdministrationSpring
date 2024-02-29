package com.college.student.event.impl;

import com.college.student.event.IEvent;
import com.college.student.pojo.Student;
import org.springframework.context.ApplicationEvent;

import java.util.List;

public class GetAllStudentEvent extends ApplicationEvent implements IEvent {
    private List<Student> studentList;
    private Object source;

    public GetAllStudentEvent(Object source, List<Student> studentList) {
        super(source);
        this.source = source;
        this.studentList = studentList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    @Override
    public Object getSource() {
        return source;
    }
}
