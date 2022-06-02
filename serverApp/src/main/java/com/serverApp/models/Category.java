package com.serverApp.models;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Flow_Category")
public class Category {

	    @Id
	    private String id;
	 
	    @Column(name="Category",length = 50)
	    private String category;
	    
	    @Column(name="Username",length = 50)
	    private String userName;
	    
	    @Column(name="Level")
	    private int level;
	    
	    public Category() {
	    }
	    public Category(String id,String userName,int level) {
	        this.id = id;
	        this.userName = userName;
	        this.level = level;    
	        }
	    
	    public String getId() {
			return id;
		}

		public void setId() {
			UUID uuid = UUID.randomUUID();
			this.id = uuid.toString();
			
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public int getLevel() {
			return level;
		}
		public void setLevel(int level) {
			this.level = level;
		}
		public void setId(String id) {
			this.id = id;
		}
		@Override
		public String toString() {
			return "Category [id=" + id + ", category=" + category + ", userName=" + userName + ", level=" + level
					+ "]";
		}
		
	    
}
