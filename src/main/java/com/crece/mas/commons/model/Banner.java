package com.crece.mas.commons.model;

import com.crece.mas.commons.enumerator.BannerStateEnumerator;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "banners", schema = "public", catalog = "crecemasdb")
public class Banner {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "banner_id")
	private Long id;

	@Column(name = "banner_guid")
	private String bannerGuid;

	@Column(name = "banner_name")
	private String bannerName;

	@Column(name = "sponsor_id_number")
	private String sponsorIdNumber;

	@Column(name = "creation_date")
	private Timestamp creationDate;

	@Column(name = "view_order")
	private Integer viewOrder;

	@Column(name = "state")
	private BannerStateEnumerator state;

	@Column(name = "desktop_image_url")
	private String desktopImageUrl;

	@Column(name = "mobile_image_url")
	private String mobileImageUrl;

	@Column(name = "start_date")
	private Timestamp startDate;

	@Column(name = "end_date")
	private Timestamp endDate;

	@Column(name = "button_toggle")
	private boolean buttonToggle;

	@Column(name = "button_text")
	private String buttonText;

	@Column(name = "redirection_url")
	private String redirectionUrl;
}
