package dao;

import model.Student;
import service.DBconnection;


import java.sql.Connection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {

    private final Connection con ;


    public StudentDao(Connection con) {

        this.con = con;
    }

    public void create(Student s) throws SQLException {

        String sql = "INSERT INTO students VALUES(null,?,?)";
        System.out.println("pas 2");

        PreparedStatement stmt = con.prepareStatement(sql);
        System.out.println("pas 3");
        stmt.setString(1, s.getNume());
        stmt.setString(2, s.getEmail());

        stmt.executeUpdate();


    }

    public List<Student> findAll() throws SQLException {
        List<Student> studenti = new ArrayList<>();
        String sql = "SELECT * FROM students";

        try (PreparedStatement stmt = con.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {


            while (rs.next()) {
                Student s = new Student();
                s.setId(rs.getInt("id"));
                s.setNume(rs.getString("nume"));
                s.setEmail(rs.getString("email"));
                studenti.add(s);
            }
        }

        return studenti;


    }

}
