package xiumu.SchoolReserve.admin.domain;

import xiumu.SchoolReserve.base.domain.BaseEntity;

import javax.persistence.*;

@Table(name = "T_ADMIN_USER")
@Entity
public class User extends BaseEntity {

	/**
	 *
	 */
	private static final long serialVersionUID = -4376674977047164142L;

	@Column(name = "EMAIL")
	String email;

	@ManyToOne
	@JoinColumn(name = "GROUP_ID")
	Merchant group;

	@Column(name = "PASSWORD")
	String password;
	@Column(name = "USERNAME")
	String username;

	public String getEmail() {
		return email;
	}

	public Merchant getGroup() {
		return group;
	}

	public String getPassword() {
		return password;
	}

	public String getUsername() {
		return username;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setGroup(Merchant group) {
		this.group = group;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
