package com.SPN.model.entiteis;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@EntityListeners(AuditingEntityListener.class)
public abstract class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	    @Column(unique=true)
	    private String username;
	    @ManyToOne
	    @JoinColumn(name="role_id", nullable=false)
	    private Role role;
	    private String password;
		@Temporal(TemporalType.TIMESTAMP)
	    @Column(name = "created_at", nullable = false, updatable = false)
	    @CreatedDate
	    private Date CreatedAt;

	    @Temporal(TemporalType.TIMESTAMP)
	    @Column(name = "updated_at", nullable = false)
	    @LastModifiedDate
	    private Date updatedAt;

		public Users(int id, String username, Role role, String password, Date createdAt, Date updatedAt) {
			super();
			this.id = id;
			this.username = username;
			this.role = role;
			this.password = password;
			CreatedAt = createdAt;
			this.updatedAt = updatedAt;
		}

		public Users() {
			super();
			// TODO Auto-generated constructor stub
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public Role getRole() {
			return role;
		}

		public void setRole(Role role) {
			this.role = role;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public Date getCreatedAt() {
			return CreatedAt;
		}

		public void setCreatedAt(Date createdAt) {
			CreatedAt = createdAt;
		}

		public Date getUpdatedAt() {
			return updatedAt;
		}

		public void setUpdatedAt(Date updatedAt) {
			this.updatedAt = updatedAt;
		}

		@Override
		public String toString() {
			return "Users [id=" + id + ", username=" + username + ", role=" + role + ", password=" + password
					+ ", CreatedAt=" + CreatedAt + ", updatedAt=" + updatedAt + "]";
		}


	    
	    
	    
}
