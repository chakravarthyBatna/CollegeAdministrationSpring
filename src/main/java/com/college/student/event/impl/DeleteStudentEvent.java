package com.college.student.event.impl;

import com.college.student.event.IEvent;
import com.college.student.pojo.Student;
import org.springframework.context.ApplicationEvent;

public class DeleteStudentEvent extends ApplicationEvent implements IEvent {
    private Object source;
    private Student student;
    public DeleteStudentEvent(Object source,Student student) {
        super(source);
        this.source = source;
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    @Override
    public Object getSource() {
        return source;
    }
}
