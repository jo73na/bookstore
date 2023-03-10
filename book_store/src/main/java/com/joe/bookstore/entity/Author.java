package com.joe.bookstore.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

@Entity
public class Author {
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Integer id;
	    private String name;
	    private String gender;
	    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	    private DateTime createdAt;
	    @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	    private DateTime updatedAt;
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public DateTime getCreatedAt() {
			return createdAt;
		}
		public void setCreatedAt(DateTime createdAt) {
			this.createdAt = createdAt;
		}
		public DateTime getUpdatedAt() {
			return updatedAt;
		}
		public void setUpdatedAt(DateTime updatedAt) {
			this.updatedAt = updatedAt;
		}
	    
	    
	    
}
