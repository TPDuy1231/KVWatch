/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Watch;

import Database.DBUtils;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WatchDAO {
    public List<WatchDTO> getAllWatches() {
        List<WatchDTO> watches = new ArrayList<>();
        String query = "SELECT * FROM Watch";

        try (Connection conn = DBUtils.getConnection();
             PreparedStatement ps = conn.prepareStatement(query);
             ResultSet rs = ps.executeQuery()) {
            
            while (rs.next()) {
                WatchDTO watch = new WatchDTO(
                    rs.getInt("Id"),
                    rs.getString("Name"),
                    rs.getString("Brand"),
                    rs.getString("Model"),
                    rs.getString("Type"),
                    rs.getString("Origin"),
                    rs.getString("Material"),
                    rs.getDouble("Price"),
                    rs.getString("WaterResistance"),
                    rs.getInt("WarrantyYears"),
                    rs.getString("Gender"),
                    rs.getString("DialColor"),
                    rs.getString("BandColor"),
                    rs.getString("BandMaterial"),
                    rs.getString("Features")
                );
                watches.add(watch);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return watches;
    }
}