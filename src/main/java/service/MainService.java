package service;

import dao.StudentDao;
import model.Student;

import java.sql.Connection;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

public class MainService {

    private MainService() {
    }

    private static final MainService service = new MainService();

    public static MainService getService() {
        return service;
    }

    public List<Student> addAndGetAll(Student s) {
        Connection con = null;
        try {
            con = DBconnection.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("pas 5" + con);
        StudentDao studentDao = new StudentDao(con);
        try {
            studentDao.create(s);
            return studentDao.findAll();
        } catch (SQLException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
        //return Collections.emptyList();

    }
}
