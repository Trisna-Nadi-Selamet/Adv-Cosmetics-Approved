//package com.serverApp.models;
//
//import java.util.Date;
//import java.util.UUID;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToOne;
//import javax.persistence.Table;
//
//@Entity
//@Table(name= "Approval")
//public class Category {
//
//	@Id
//    private String id;
//    
//    @Column(name="Category",length = 50)
//	private String category;
//    
//    @Column(name="Username",length = 50)
//	private String userName;
//    
//    @Column(name="LevUser",length = 5)
//	private int levUser;
//    
//    @Column(columnDefinition="DATE")
//    private Date update_date;
//    
//	    
//	    public Category() {
//	    }
//	    public Category(String id,String category,String userName,int levUser, Date update_date ) {
//	        this.id = id;
//	        this.category = category;
//	        this.userName = userName;
//	        this.levUser = levUser; 
//	        this.update_date = update_date; 
//	        }
//	    
//	    public String getId() {
//			return id;
//		}
//
//		public void setId() {
//			UUID uuid = UUID.randomUUID();
//			this.id = uuid.toString();
//			
//		}
//		public Date getUpdate_date() {
//			return update_date;
//		}
//
//		public void setUpdate_date() {
//			this.update_date = new Date();;
//		}
//		
//		public String getCategory() {
//			return category;
//		}
//		public void setCategory(String category) {
//			this.category = category;
//		}
//		public String getUserName() {
//			return userName;
//		}
//		public void setUserName(String userName) {
//			this.userName = userName;
//		}
//		public int getLevUser() {
//			return levUser;
//		}
//		public void setLevUser(int levUser) {
//			this.levUser = levUser;
//		}
//		
//		    
//}
