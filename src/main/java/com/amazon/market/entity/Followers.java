package com.amazon.market.entity;

// Generated Apr 12, 2018 5:40:29 PM by Hibernate Tools 5.2.8.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Followers generated by hbm2java
 */
@Entity
@Table(name = "Followers")
public class Followers implements java.io.Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7481078282851380678L;
	private Integer id;
	//private int userid;
	private Account user;
	private Account follower;
	//private int followerid;
	private Date lastupdated;

	public Followers() {
	}

	public Followers(Account userid, Account followerid, Date lastupdated) {
		this.user = userid;
		this.follower = followerid;
		this.lastupdated = lastupdated;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "Id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Userid", nullable = false, //
    foreignKey = @ForeignKey(name = "USER_DETAIL_FK"))
	public Account getUser() {
		return this.user;
	}

	public void setUser(Account userid) {
		this.user = userid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Followerid", nullable = false, //
    foreignKey = @ForeignKey(name = "USER_DETAIL_FK"))
	public Account getFollower() {
		return this.follower;
	}

	public void setFollower(Account followerid) {
		this.follower = followerid;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "Lastupdated", nullable = false, length = 19)
	public Date getLastupdated() {
		return this.lastupdated;
	}

	public void setLastupdated(Date lastupdated) {
		this.lastupdated = lastupdated;
	}
	@Override
	public String toString() {
		return "Followers [id=" + id + ", userid=" + user.getId() + ", followerid=" + follower.getId() + ", lastupdated="
				+ lastupdated + "]";
	}


}