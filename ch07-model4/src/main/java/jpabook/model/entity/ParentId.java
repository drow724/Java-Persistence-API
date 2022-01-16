package jpabook.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ParentId implements Serializable{

	private static final long serialVersionUID = 3794169685243907585L;
	
	@Column(name = "PARENT_ID1")
	private String id1;
	@Column(name = "PARENT_ID2")
	private String id2;
	
	public ParentId() {}
	
	public ParentId(String id1, String id2) {
		this.id1 = id1;
		this.id2 = id2;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id1 == null) ? 0 : id1.hashCode());
		result = prime * result + ((id2 == null) ? 0 : id2.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ParentId other = (ParentId) obj;
		if (id1 == null) {
			if (other.id1 != null)
				return false;
		} else if (!id1.equals(other.id1))
			return false;
		if (id2 == null) {
			if (other.id2 != null)
				return false;
		} else if (!id2.equals(other.id2))
			return false;
		return true;
	}

	/**
	 * @return the id1
	 */
	public String getId1() {
		return id1;
	}

	/**
	 * @param id1 the id1 to set
	 */
	public void setId1(String id1) {
		this.id1 = id1;
	}

	/**
	 * @return the id2
	 */
	public String getId2() {
		return id2;
	}

	/**
	 * @param id2 the id2 to set
	 */
	public void setId2(String id2) {
		this.id2 = id2;
	}
	
}
