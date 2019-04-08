package com.example.JunitExample.Controller;


import com.example.JunitExample.Model.Student;
import com.example.JunitExample.Repos.StudentRepo;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;






import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
@WebMvcTest(StudentController.class)
public class StudentControllerTest {



        @Autowired
        private MockMvc mockMvc;

        @Autowired
        private Student student;

        @MockBean
    StudentRepo studentRepo;



        private final String URL = "/saveStudent/";

        @Test
        public void saveStudent() throws Exception {

            // prepare data and mock's behaviour
            student.setId(1);
            student.setName("varsha");
            when(studentRepo.save(any(Student.class))).thenReturn(student);
        }
    }
