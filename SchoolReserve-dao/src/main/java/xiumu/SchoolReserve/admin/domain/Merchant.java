package xiumu.SchoolReserve.admin.domain;

import xiumu.SchoolReserve.base.domain.BaseTreeEntity;

import javax.persistence.*;
import java.util.Set;

@Table(name = "Merchant")
@Entity
@NamedQueries({ @NamedQuery(name = "Group.getRoot", query = "select g from Group g where g.parent is null") })
public class Merchant extends BaseTreeEntity<Merchant> {

	/**
	 *
	 */
	private static final long serialVersionUID = -1751952224371998469L;

	@Column(name = "NAME")
	String name;

	@Column(name = "ADDRESS")
	String address;

	@OneToMany(mappedBy = "group", cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
	Set<User> users;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
