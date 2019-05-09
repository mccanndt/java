package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import business.Vendor;

public class VendorDB extends DBConnection implements DAO<Vendor> {
	
	@Override
	public Vendor get(int id) {
		String sql = "SELECT * FROM Vendor WHERE ID = ?";
		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, Integer.toString(id));
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				String code = rs.getString("Code");
				String name = rs.getString("Name");
				String address = rs.getString("Address");
				String city = rs.getString("City");
				String state = rs.getString("State");
				String zip = rs.getString("Zip");
				String phoneNumber = rs.getString("PhoneNumber");
				String email = rs.getString("Email");
				boolean isPreApproved = rs.getBoolean("IsPreApproved");

				Vendor v = new Vendor(id, code, name, address, city, state, zip, phoneNumber, email, isPreApproved);
				return v;
			} else {
				return null;
			}
		} catch (SQLException e) {
			System.err.println(e);
			return null;
		}
	}

	@Override
	public List<Vendor> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(Vendor t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Vendor t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Vendor t) {
		// TODO Auto-generated method stub
		return false;
	}

}
