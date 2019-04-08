package com.example.JDBCExample.Controller;

import com.example.JDBCExample.Dao.DepartmentDao;
import com.example.JDBCExample.Dao.StudentDao;
import com.example.JDBCExample.Model.Department;
import com.example.JDBCExample.Model.Student;
//import com.example.JDBCExample.Repos.StudentRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentDao studentDao;

    @Autowired
    private DepartmentDao departmentDao;

    @GetMapping(value="/getdata")
    public List<Student> getData(){

        List<Student> list=studentDao.getStudentList();
        return list;
    }

    @GetMapping(value="/getdata1/{id}")
    public Student getData(@PathVariable Integer id){
        Student st=studentDao.getStudent(id);
        return st;
    }

    @PostMapping(value="/save")
    public String saveStuData(@RequestBody Student student){
        return studentDao.saveData(student);

    }

    @GetMapping(value="/update/{id}/{name}")
    public String updateData(@PathVariable Integer id,@PathVariable String name){
        String str=studentDao.updateStudent(id,name);
        return str;
    }

    @GetMapping(value="/delete/{id}")
    public String deleteData(@PathVariable Integer id){
        String str=studentDao.deleteStudent(id);
        return str;
    }


    @PostMapping(value="/savedeptstu")
    public String saveStuDeptAndStu(@RequestBody Student student){

        Department d=student.;
        //departmentDao.saveDept(d);
        studentDao.saveData(student);
        return studentDao.saveData(student);
    }



}
