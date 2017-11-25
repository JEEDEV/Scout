package org.scout.education.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="regiment")
public class Regiment {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="regim_id")
	private Long id;
	@Column(name="regim_name")
	private String name;
	@Column(name="regim_adr")
	private String adresse;
	@Column(name="regim_phone")
	private String telphone;
	@Column(name="regim_link")
	private SocialMedia link;
	@Column(name="regim_whoweare")
	private String whoweare;
	private  List<Group> groups;

	
	
}
