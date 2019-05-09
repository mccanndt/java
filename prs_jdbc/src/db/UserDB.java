package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import business.User;

public class UserDB extends DBConnection implements DAO<User> {

	@Override
	public User get(int id) {
		String sql = "SELECT * FROM User WHERE ID = ?";
		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, Integer.toString(id));
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				String userName = rs.getString("UserName");
				String password = rs.getString("Password");
				String firstName = rs.getString("FirstName");
				String lastName = rs.getString("LastName");
				String phoneNumber = rs.getString("PhoneNumber");
				String email = rs.getString("Email");
				boolean isReviewer = rs.getBoolean("IsReviewer");
				boolean isAdmin = rs.getBoolean("IsAdmin");

				User u = new User(id, userName, password, firstName, lastName, phoneNumber, email, isReviewer, isAdmin);
				return u;
			} else {
				return null;
			}
		} catch (SQLException e) {
			System.err.println(e);
			return null;
		}
	}

	@Override
	public List<User> getAll() {
		String sql = "SELECT * FROM User";
		List<User> users = new ArrayList<>();
		try (Connection conn = getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery()) {
			while (rs.next()) {
				int id = rs.getInt("ID");
				String userName = rs.getString("UserName");
				String password = rs.getString("Password");
				String firstName = rs.getString("FirstName");
				String lastName = rs.getString("LastName");
				String phoneNumber = rs.getString("PhoneNumber");
				String email = rs.getString("Email");
				boolean isReviewer = rs.getBoolean("IsReviewer");
				boolean isAdmin = rs.getBoolean("IsAdmin");

				User u = new User(id, userName, password, firstName, lastName, phoneNumber, email, isReviewer, isAdmin);
				users.add(u);
			}
		} catch (SQLException e) {
			System.err.println(e);
			return null;
		}
		return users;
	}

	@Override
	public boolean add(User t) {
		String sql = "INSERT INTO User (UserName, Password, FirstName, LastName, PhoneNumber, Email, IsReviewer, IsAdmin) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, t.getUserName());
			ps.setString(2, t.getPassword());
			ps.setString(3, t.getFirstName());
			ps.setString(4, t.getLastName());
			ps.setString(5, t.getPhoneNumber());
			ps.setString(6, t.getEmail());
			ps.setBoolean(7, t.isReviewer());
			ps.setBoolean(8, t.isAdmin());
			ps.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e);
			return false;
		}
		return true;
	}

	@Override
	public boolean update(User t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(User t) {
		String sql = "DELETE FROM User WHERE ID = ?";
		try (Connection conn = getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, t.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			System.err.println(e);
			return false;
		}
		return true;
	}

}
