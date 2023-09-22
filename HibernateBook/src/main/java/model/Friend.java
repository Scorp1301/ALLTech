package model;

import java.util.ArrayList;
import java.util.Collection;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
@Entity
public class Friend {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String name;
	private String email;
	
	@ElementCollection
	@CollectionTable(name = "friend_nicknames", joinColumns = @JoinColumn(name = "friend_id"))
	@Column(name = "nicknames")
	private Collection<String> nicknames = new ArrayList<String>();
	
	public Friend() {
		
	}


	public Friend(String name, String email) {
		this.name = name;
		this.email = email;
	}
	public Collection<String> getNicknames(){
		return nicknames;
	}

	@Override
	public String toString() {
		return "Friend [id=" + id + ", name=" + name + ", email=" + email + ", nicknames=" + nicknames + "]";
	}
	

}
