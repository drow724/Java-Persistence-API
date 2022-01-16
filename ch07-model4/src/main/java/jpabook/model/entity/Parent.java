package jpabook.model.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
//@IdClass(ParentId.class)
public class Parent {

//	@Id
//	@Column(name = "PARENT_ID1")
//	private String id1;
//	
//	@Id
//	@Column(name = "PARENT_ID2")
//	private String id2;
	
	@EmbeddedId
	private ParentId id;
	
	private String name;

//	/**
//	 * @return the id1
//	 */
//	public String getId1() {
//		return id1;
//	}
//
//	/**
//	 * @param id1 the id1 to set
//	 */
//	public void setId1(String id1) {
//		this.id1 = id1;
//	}
//
//	/**
//	 * @return the id2
//	 */
//	public String getId2() {
//		return id2;
//	}
//
//	/**
//	 * @param id2 the id2 to set
//	 */
//	public void setId2(String id2) {
//		this.id2 = id2;
//	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public ParentId getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(ParentId id) {
		this.id = id;
	}
	
}
