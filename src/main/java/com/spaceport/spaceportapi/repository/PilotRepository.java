package com.spaceport.spaceportapi.repository;

import com.spaceport.spaceportapi.model.Pilot;
import com.spaceport.spaceportapi.utils.DatabaseManager;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PilotRepository {

    public List<Pilot> findAll() {
        String sql = "select id, name, license_code from pilots order by id";
        List<Pilot> res = new ArrayList<>();

        try (Connection c = DatabaseManager.getInstance().getConnection();
             PreparedStatement ps = c.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                res.add(new Pilot(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("license_code")
                ));
            }
            return res;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Pilot create(String name, String licenseCode) {
        String sql = "insert into pilots(name, license_code) values (?, ?) returning id";
        try (Connection c = DatabaseManager.getInstance().getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setString(1, name);
            ps.setString(2, licenseCode);

            try (ResultSet rs = ps.executeQuery()) {
                rs.next();
                int id = rs.getInt(1);
                return new Pilot(id, name, licenseCode);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean updateName(int id, String newName) {
        String sql = "update pilots set name=? where id=?";
        try (Connection c = DatabaseManager.getInstance().getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setString(1, newName);
            ps.setInt(2, id);
            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean delete(int id) {
        String sql = "delete from pilots where id=?";
        try (Connection c = DatabaseManager.getInstance().getConnection();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setInt(1, id);
            return ps.executeUpdate() == 1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}


