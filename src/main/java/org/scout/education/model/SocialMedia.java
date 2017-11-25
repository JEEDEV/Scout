package org.scout.education.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="social_media")
public class SocialMedia {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="social_id")
	private Long id;
	@Column(name="social_mail")
	private String email;
	@Column(name="social_face")
	private String facebook;
	@Column(name="social_insta")
	private String instagramme;
	@Column(name="social_gplus")
	private String gplus;
	@Column(name="social_twit")
	private String twitter;
	
}
