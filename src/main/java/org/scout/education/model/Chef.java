package org.scout.education.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="chef")
public class Chef {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="chef_id")
	private Long id;
	@Column(name="chef_fname")
	private String firstName;
	@Column(name="chef_lname")
	private String lastName;
	@Column(name="chef_link")
	private SocialMedia link;
	@Column(name="chef_adr")
	private String adresse;
	@Column(name="chef_phone")
	private String telphone;
	@Column(name="chef_group")
	private Group group;
	
	
}
